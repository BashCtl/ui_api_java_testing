package steps;

import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import pages.ContactUsPage;

@Slf4j
public class ContactUsSteps extends BaseSteps {

    private ContactUsPage contactUsPage;

    public ContactUsSteps(WebDriver driver) {
        super(driver);
        contactUsPage = new ContactUsPage(driver);
    }

    @Step("User opens 'Contact Us' page.")
    public ContactUsSteps openPage() {
        log.info("Open 'Contact Us' page.");
        contactUsPage.openPage();
        return this;
    }

    @Step("User enters {name} name")
    public ContactUsSteps enterName(String name) {
        log.info("Fill name filed with: {}", name);
        contactUsPage.getNameInput().sendKeys(name);
        return this;
    }

    @Step("User enters email address: {email}")
    public ContactUsSteps enterEmail(String email) {
        log.info("Fill email field: {}", email);
        contactUsPage.getEmailInput().sendKeys(email);
        return this;
    }

    @Step("User enters subject: {subject}")
    public ContactUsSteps enterSubject(String subject) {
        log.info("Fill subject field: {}", subject);
        contactUsPage.getSubjectInput().sendKeys(subject);
        return this;
    }

    @Step("User enters message: {message}")
    public ContactUsSteps enterMessage(String message) {
        log.info("Fill message field: {}", message);
        contactUsPage.getMessageInput().sendKeys(message);
        return this;
    }

    @Step("User clicks 'Send Message' button.")
    public ContactUsSteps clickSendMsgBtn() {
        log.info("Click 'Send Message' button");
        contactUsPage.getSendMsgBtn().click();
        return this;
    }
}
