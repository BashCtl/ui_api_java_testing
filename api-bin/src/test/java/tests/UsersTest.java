package tests;

import com.github.javafaker.Faker;
import entities.EntityProvider;
import entity.User;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.AuthSteps;
import steps.BaseSteps;
import steps.UsersSteps;

import static entity.EntityTypeImpl.USER;

public class UsersTest extends BaseTest {

    private AuthSteps authSteps = new AuthSteps();
    private UsersSteps usersSteps = new UsersSteps();
    private User user;
    private Faker faker = new Faker();

    @BeforeClass
    public void beforeClass() {
        user = EntityProvider.getEntity(USER);
        authSteps.login(user)
                .verifyStatusCode(200)
                .verifyResponseMsg(messages.getSuccess());
    }

    @Test
    public void getUsersPageByNumber() {
        usersSteps.getUsersPage(1)
                .verifyStatusCode(200)
                .verifyPageField(1)
                .verifyPerPageField(10);
    }
}
