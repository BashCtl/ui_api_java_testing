package steps;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

@Log4j2
public class LoginSteps extends BaseSteps {

    private final LoginPage loginPage;

    public LoginSteps(WebDriver driver) {
        super(driver);
        loginPage = new LoginPage(driver);
    }

    @Step("User opens Login page.")
    public LoginSteps openPage() {
        log.info("Open Login page.");
        loginPage.openPage();
        return this;
    }

    @Step("User enters username: {username}")
    public LoginSteps enterUsername(String username) {
        log.info("Clear username input.");
        loginPage.getUsernameInput().clear();
        log.info("Enter username: {}", username);
        loginPage.getUsernameInput().sendKeys(username);
        return this;
    }

    @Step("User enters password: {password}")
    public LoginSteps enterPassword(String password) {
        log.info("Clear password input.");
        loginPage.getPasswordInput().clear();
        log.info("Enter password: {}", password);
        loginPage.getPasswordInput().sendKeys(password);
        return this;
    }

    @Step("User clicks 'Sign in' button")
    public LoginSteps clickSignInBtn() {
        log.info("Click 'Sing in' button.");
        loginPage.getSingInBtn().click();
        return this;
    }


}
