package pages;

import io.qameta.allure.Step;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.PropsLoader.loadProperties;

@Log4j2
@Getter
public class HomePage extends BasePage {



    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "logged-user-name")
    private WebElement usernameLabel;

    @FindBy(className = "logged-user-role")
    private WebElement userRoleLabel;


}
