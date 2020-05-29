package pages.Controls;

import utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import pages.HomePage;

public class ModalWindow extends Driver {

    WebElement
            modalWindow,
            userName,
            passwordField,
            signInButton;

    public ModalWindow(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        initializeElements();
    }

    private void initializeElements() {
        modalWindow = driver.findElement(By.className("lightbox"));
        userName = driver.findElement(By.id("frontend_user_email"));
        passwordField = driver.findElement(By.id("frontend_user_password"));
        signInButton = driver.findElement(By.className("sign-in--submit-container"));
    }

    public ModalWindow setName(String name) {
        userName.click();
        userName.sendKeys(name);
        return this;
    }

    public ModalWindow setPasswordField(String password) {
        Reporter.getOutput();
        userName.click();
        passwordField.sendKeys(password);
        return this;
    }

    public HomePage clickSignIn() {
        signInButton.click();
        return new HomePage(driver);
    }
}
