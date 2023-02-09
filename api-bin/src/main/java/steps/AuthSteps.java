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


    @Step("User makes request to basic authentication.")
    public AuthSteps registration(User user) {
        response = given().spec(specsBuilder.registration())
                .body(user)
                .when()
                .post();
        String token = response.jsonPath().getString("data.Token");
        authToken.set(token);
        baseResponse.set(response);
        log.info("Registration response body: \n{}", response.asPrettyString());
        return this;
    }

    @Step("User performs login.")
    public AuthSteps login(User user) {
        response = given().spec(specsBuilder.login())
                .body(user)
                .when()
                .post();
        String token = response.jsonPath().getString("data.Token");
        authToken.set(token);
        baseResponse.set(response);
        log.info("Login response body: \n{}", response.asPrettyString());
        return this;
    }

    @Step("Response status code should be: {statusCode}")
    public AuthSteps verifyStatusCode(int statusCode) {
        baseResponse.get().then().assertThat().statusCode(statusCode);
        return this;
    }

    @Step("Response message should be: {message}")
    public AuthSteps verifyResponseMsg(String message) {
        baseResponse.get().then().body("message", equalTo(message));
        return this;
    }

    @Step("Response field 'Name' should be: {name}")
    public AuthSteps verifyResponseNameField(String name) {
        baseResponse.get().then().body("data.Name", equalTo(name));
        return this;
    }

    @Step("Response field 'Email' should be: {email}")
    public AuthSteps verifyResponseEmailField(String email) {
        baseResponse.get().then().body("data.Email", equalTo(email));
        return this;
    }
}
