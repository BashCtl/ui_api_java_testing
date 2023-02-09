package steps;

import entity.User;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import lombok.extern.slf4j.Slf4j;
import specs.SpecsBuilder;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@Slf4j
public class UsersSteps extends BaseSteps<UsersSteps> {
    private SpecsBuilder specsBuilder = new SpecsBuilder();
    private Response response;

    @Step("Get users page by number: {page}")
    public <T> UsersSteps getUsersPage(T page) {
        String token = authToken.get();
        response = given().spec(specsBuilder.getUsersPage(token))
                .queryParam("page", page)
                .when()
                .get();
        baseResponse.set(response);
        log.info("Response users page: \n{}", response.asPrettyString());
        return this;
    }

    @Step("Verify 'page' filed in a response: {page}")
    public UsersSteps verifyPageField(int page) {
        baseResponse.get().then().body("page", equalTo(page));
        return this;
    }

    @Step("Verify 'per_page' field: {perPage}.")
    public UsersSteps verifyPerPageField(int perPage) {
        baseResponse.get().then().body("per_page", equalTo(perPage));
        return this;
    }


    @Step("Get user by id: {id}.")
    public <T> UsersSteps getUserById(T id) {
        String token = authToken.get();
        response = given().spec(specsBuilder.getUserById(token))
                .pathParam("id", id)
                .when()
                .get();
        baseResponse.set(response);
        log.info("Response body for request user by id: \n {}", response.asPrettyString());
        return this;
    }

    @Step("Verify user 'id' field in response body: {id}.")
    public UsersSteps verifyUserId(int id) {
        baseResponse.get().then().body("id", equalTo(id));
        return this;
    }

    @Step("Verify user 'name' field in response body for user request by id: {name}")
    public UsersSteps verifyUserName(String name) {
        baseResponse.get().then().body("name", equalTo(name));
        return this;
    }

    @Step("Verify user 'email' filed in response body for user request by id: {email}")
    public UsersSteps verifyUserEmail(String email) {
        baseResponse.get().then().body("email", equalTo(email));
        return this;
    }

    @Step("Verify user 'location' field: {location}")
    public UsersSteps verifyUserLocation(String location) {
        baseResponse.get().then().body("location", equalTo(location));
        return this;
    }
}
