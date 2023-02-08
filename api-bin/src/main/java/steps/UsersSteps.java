package steps;

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
    public UsersSteps getUsersPage(int page) {
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
    public UsersSteps verifyPageField(int page){
        baseResponse.get().then().body("page", equalTo(page));
        return this;
    }

    @Step("Verify 'per_page' field: {perPage}.")
    public UsersSteps verifyPerPageField(int perPage){
        baseResponse.get().then().body("per_page", equalTo(perPage));
        return this;
    }

}
