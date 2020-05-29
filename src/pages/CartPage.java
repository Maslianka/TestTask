package pages;

import utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CartPage extends Driver {
    WebElement title;

    public CartPage(WebDriver driver) {
        super(driver);
        initializeElements();
    }

    private void initializeElements() {
        title = driver.findElement(By.className("cart-item--title"));
    }

    public void verifyAutoPresentInCart(String expectedResult){
        Assert.assertEquals(title.getText(),expectedResult);
    }
}
