package steps;

import entities.User;
import io.qameta.allure.Step;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import specs.SpecsBuilder;



import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@Slf4j
public class AuthSteps extends BaseSteps<AuthSteps> {
    private SpecsBuilder specsBuilder = new SpecsBuilder();
    @Getter
    @Setter
    private ThreadLocal<String> authToken = ThreadLocal.withInitial(() -> null);

    @Step("User makes request to basic authentication.")
    public AuthSteps registration(User user) {
        String token = given().spec(specsBuilder.registration())
                .body(user)
                .when()
                .post()
                .then().assertThat().statusCode(200)
                .assertThat().body("message", equalTo("success"))
                .extract().path("data.Token");
        authToken.set(token);
        log.info("Auth token is: {}", authToken.get());


        return this;
    }
}
