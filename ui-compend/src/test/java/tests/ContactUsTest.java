package tests;

import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.ContactUsSteps;

public class ContactUsTest extends BaseTest {

    private ContactUsSteps contactUsSteps;
    private String name;
    private String email;
    private String subject;
    private String message;

    @BeforeMethod(alwaysRun = true)
    @Override
    public void beforeMethod(ITestContext context) {
        super.beforeMethod(context);
        contactUsSteps = new ContactUsSteps(driver);
        contactUsSteps.openPage();
        name = faker.funnyName().name();
        email = faker.bothify("????##@test.com");
        subject = faker.friends().character();
        message = faker.friends().quote();
    }

    @Test
    public void fillContactForm() {
        contactUsSteps.enterName(user.getFirstName())
                .enterEmail(user.getEmail())
                .enterSubject(user.getSubject())
                .enterMessage(user.getMessage());
    }

    @Test
    public void fakeTestForGeneralAmount1() {
        contactUsSteps.enterName(name)
                .enterEmail(email)
                .enterSubject(subject)
                .enterMessage(message);
    }

    @Test
    public void fakeTestForGeneralAmount2() {
        contactUsSteps.enterName(name)
                .enterEmail(email)
                .enterSubject(subject)
                .enterMessage(message);
    }

    @Test
    public void fakeTestForGeneralAmount3() {
        contactUsSteps.enterName(name)
                .enterEmail(email)
                .enterSubject(subject)
                .enterMessage(message);
    }

    @Test
    public void fakeTestForGeneralAmount4() {
        contactUsSteps.enterName(name)
                .enterEmail(email)
                .enterSubject(subject)
                .enterMessage(message);
    }

    @Test
    public void fakeTestForGeneralAmount5() {
        contactUsSteps.enterName(name)
                .enterEmail(email)
                .enterSubject(subject)
                .enterMessage(message);
    }

    @Test
    public void fakeTestForGeneralAmount6() {
        contactUsSteps.enterName(name)
                .enterEmail(email)
                .enterSubject(subject)
                .enterMessage(message);
    }

    @Test
    public void fakeTestForGeneralAmount7() {
        contactUsSteps.enterName(name)
                .enterEmail(email)
                .enterSubject(subject)
                .enterMessage(message);
    }

    @Test
    public void fakeTestForGeneralAmount8() {
        contactUsSteps.enterName(name)
                .enterEmail(email)
                .enterSubject(subject)
                .enterMessage(message);
    }


    @Test
    public void fakeTestForGeneralAmount9() {
        contactUsSteps.enterName(name)
                .enterEmail(email)
                .enterSubject(subject)
                .enterMessage(message);
    }


    @Test
    public void fakeTestForGeneralAmount10() {
        contactUsSteps.enterName(name)
                .enterEmail(email)
                .enterSubject(subject)
                .enterMessage(message);
    }

    @Test
    public void fakeTestForGeneralAmount11() {
        contactUsSteps.enterName(name)
                .enterEmail(email)
                .enterSubject(subject)
                .enterMessage(message);
    }

    @Test
    public void fakeTestForGeneralAmount12() {
        contactUsSteps.enterName(name)
                .enterEmail(email)
                .enterSubject(subject)
                .enterMessage(message);
    }

    @Test
    public void fakeTestForGeneralAmount13() {
        contactUsSteps.enterName(name)
                .enterEmail(email)
                .enterSubject(subject)
                .enterMessage(message);
    }

    @Test
    public void fakeTestForGeneralAmount14() {
        contactUsSteps.enterName(name)
                .enterEmail(email)
                .enterSubject(subject)
                .enterMessage(message);
    }

    @Test
    public void fakeTestForGeneralAmount15() {
        contactUsSteps.enterName(name)
                .enterEmail(email)
                .enterSubject(subject)
                .enterMessage(message);
    }

    @Test
    public void fakeTestForGeneralAmount16() {
        contactUsSteps.enterName(name)
                .enterEmail(email)
                .enterSubject(subject)
                .enterMessage(message);
    }

    @Test
    public void fakeTestForGeneralAmount17() {
        contactUsSteps.enterName(name)
                .enterEmail(email)
                .enterSubject(subject)
                .enterMessage(message);
    }

    @Test
    public void fakeTestForGeneralAmount18() {
        contactUsSteps.enterName(name)
                .enterEmail(email)
                .enterSubject(subject)
                .enterMessage(message);
    }

    @Test
    public void fakeTestForGeneralAmount19() {
        contactUsSteps.enterName(name)
                .enterEmail(email)
                .enterSubject(subject)
                .enterMessage(message);
    }

    @Test
    public void fakeTestForGeneralAmount20() {
        contactUsSteps.enterName(name)
                .enterEmail(email)
                .enterSubject(subject)
                .enterMessage(message);
    }
}
