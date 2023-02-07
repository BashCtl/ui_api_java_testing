package tests;

import com.github.javafaker.Faker;
import entities.EntityProvider;
import entity.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.AuthSteps;

import static entity.EntityTypeImpl.USER;

public class AuthTest extends BaseTest {

    private AuthSteps authSteps = new AuthSteps();
    private User user;
    private Faker faker = new Faker();
    private String email;

    @BeforeMethod
    @Override
    public void beforeMethod() {
        super.beforeMethod();
        user = EntityProvider.getEntity(USER);
        email = faker.bothify("????####@test.com");
    }

    @Test
    public void validUserRegistration() {
        user.setEmail(email);
        authSteps.registration(user)
                .verifyStatusCode(200)
                .verifyResponseMsg(errors.getSuccess());
    }

    @Test
    public void regWithAlreadyRegisteredEmail() {
        authSteps.registration(user)
                .verifyStatusCode(200)
                .verifyResponseMsg(errors.getRegisteredEmailErr());
    }
}
