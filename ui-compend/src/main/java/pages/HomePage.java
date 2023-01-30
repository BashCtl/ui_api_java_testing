package pages;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Slf4j
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
