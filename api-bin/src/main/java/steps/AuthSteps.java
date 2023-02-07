package steps;

import entity.User;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import specs.SpecsBuilder;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@Slf4j
public class AuthSteps extends BaseSteps<AuthSteps> {
    private SpecsBuilder specsBuilder = new SpecsBuilder();
    private Response response;
    @Getter
    @Setter
    private ThreadLocal<String> authToken = ThreadLocal.withInitial(() -> null);

    @Step("User makes request to basic authentication.")
    public AuthSteps registration(User user) {
        response = given().spec(specsBuilder.registration())
                .body(user)
                .when()
                .post();
        String token = response.jsonPath().getString("data.Token");
        authToken.set(token);
        log.info("Auth token is: {}", authToken.get());
        return this;
    }

    @Step("Response status code should be: {statusCode}")
    public AuthSteps verifyStatusCode(int statusCode) {
        response.then().assertThat().statusCode(statusCode);
        return this;
    }

    @Step("Response message should be: {message}")
    public AuthSteps verifyResponseMsg(String message) {
        response.then().body("message", equalTo(message));
        return this;
    }
}
