package steps;

import io.qameta.allure.Step;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.equalTo;

public class BaseSteps<T extends BaseSteps<T>> {


    protected static ThreadLocal<String> authToken = ThreadLocal.withInitial(() -> null);
    protected static ThreadLocal<Response> baseResponse = ThreadLocal.withInitial(() -> null);

    @Step("Response status code should be: {statusCode}")
    public T verifyStatusCode(int statusCode) {
        baseResponse.get().then().assertThat().statusCode(statusCode);
        return (T) this;
    }

    @Step("Verify response error 'Message': {message}")
    public T verifyErrorMsg(String message){
        baseResponse.get().then().body("Message", equalTo(message));
        return (T) this;
    }
}
