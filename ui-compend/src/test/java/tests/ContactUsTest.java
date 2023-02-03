package tests;

import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.ContactUsSteps;

public class ContactUsTest extends BaseTest {

    private ContactUsSteps contactUsSteps;

    @BeforeMethod(alwaysRun = true)
    @Override
    public void beforeMethod(ITestContext context) {
        super.beforeMethod(context);
        contactUsSteps = new ContactUsSteps(driver);
        contactUsSteps.openPage();
    }

    @Test
    public void fillContactForm() {
        contactUsSteps.enterName(user.getFirstName())
                .enterEmail(user.getEmail())
                .enterSubject(user.getSubject())
                .enterMessage(user.getMessage());
    }
}
