package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.PropsLoader.loadProperties;

@Log4j2
public class HomePage extends BasePage {



    public HomePage(WebDriver driver) {
        super(driver);
    }




}
