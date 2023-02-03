package pages;

import lombok.Getter;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class ContactUsPage extends BasePage {

    private final String CONTACT_URL = ENV_URL + "/contact.php";

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "inputName")
    private WebElement nameInput;

    @FindBy(id = "inputEmail")
    private WebElement emailInput;

    @FindBy(id = "inputSubject")
    private WebElement subjectInput;

    @FindBy(id = "inputMessage")
    private WebElement messageInput;

    @FindBy(xpath = "//*[text()='Send Message']")
    private WebElement sendMsgBtn;

    public ContactUsPage openPage() {
        driver.get(CONTACT_URL);
        return this;
    }
}
