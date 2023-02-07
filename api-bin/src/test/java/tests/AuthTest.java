package tests;

import entities.User;
import org.testng.annotations.Test;
import steps.AuthSteps;

public class AuthTest {

    private AuthSteps authSteps = new AuthSteps();

    @Test
    public void basicAuthValidTest(){
        authSteps.registration(new User("JohnWick","johnwic4k@testmail.com","My234SuperPass##"));
    }
}
