package pages;

import utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class MyProfile extends Driver {
    MyProfile(WebDriver driver){
        super(driver);
        initializeElements();
    }

    private WebElement signOutButton;

    private void initializeElements(){
        signOutButton = driver.findElement(By.xpath("//a[text() = 'Sign out']"));
    }

    public void verifyUserLoggedIn() {
        Assert.assertEquals(signOutButton.getText(),"Sign out");
    }
}
