package pages.Controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;

import java.util.ArrayList;
import java.util.List;

public class Header extends Driver {
    WebElement logIn,
            cart,
            modelsLabel;
    List<WebElement> modelsList;


    Actions builder = new Actions(driver);
    WebDriverWait wait = new WebDriverWait(driver, 15);

    public Header(WebDriver driver) {
        super(driver);
        initializeElements();
    }

    private void initializeElements() {
        logIn = driver.findElement(By.className("login-icon"));
        cart = driver.findElement(By.className("open-cart-button"));
        modelsLabel = driver.findElement(By.cssSelector("li[data-node-id= '7']"));
        modelsList = driver.findElements(By.xpath("//li[@data-node-id = '7']//li[@data-node-id]/a"));
    }


    public void clickOnLogInIcon() {
        logIn.click();
    }

    public void goToProfile() {
        driver.findElement(By.cssSelector("a[title = 'Profile']")).click();
    }

    public void clickOnSearchIcon() {
        logIn.click();
    }

    public void clickOnCartIcon() {
        cart.click();
    }

    public List<String> getListOfModels() {
        builder.moveToElement(modelsLabel).perform();
        List<String> models = new ArrayList<>();
        for (WebElement s : modelsList) {
            if (s.getText().length() > 0)
                models.add(s.getText());
        }
        return models;
    }

    public void selectModel(String modelName, String complectation) {
        builder.moveToElement(modelsLabel).perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@data-node-id= '7']//a[text() = '" + modelName + "']/..")));
        builder.moveToElement(driver.findElement(By.xpath("//li[@data-node-id= '7']//a[text() = '" + modelName + "']/.."))).build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@data-node-id= '7']//a[text() = '" + complectation + "']/..")));
        builder.moveToElement(driver.findElement(By.xpath("//li[@data-node-id= '7']//a[text() = '" + complectation + "']"))).perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@data-node-id= '7']//a[text() = '" + complectation + "']/..")));
        driver.findElement(By.xpath("//li[@data-node-id= '7']//a[text() = '" + complectation + "']")).click();
    }

}
