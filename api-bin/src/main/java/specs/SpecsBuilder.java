package specs;

import endpoints.ThreadSafeEndpoint;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.HttpClientConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import utils.PropsLoader;

import static endpoints.Auth.REGISTRATION;

public class SpecsBuilder {

    private final String BASE_ULR = PropsLoader.loadProperties()
            .getProperty(System.getProperty("env", "QA"));

    private RequestSpecBuilder mainSpec() {
        return new RequestSpecBuilder()
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .setBaseUri(BASE_ULR)
                .setConfig(RestAssuredConfig.config()
                        .httpClient(HttpClientConfig.httpClientConfig()
                                .setParam("http.socket.timeout", 30000)))
                .addFilter(new AllureRestAssured())
                .setRelaxedHTTPSValidation()
                .log(LogDetail.ALL);
    }

    public RequestSpecification registration() {
        ThreadSafeEndpoint.setEndpoint(REGISTRATION);
        return mainSpec()
                .setBasePath(ThreadSafeEndpoint.getEndpoint())
                .build();
    }
}
