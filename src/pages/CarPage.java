package pages;

import utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.Controls.Header;

import java.io.File;

public class CarPage extends Driver {
    Header header = new Header(driver);
    WebElement addToCartButton,
            downloadPDF;

    public CarPage(WebDriver driver) {
        super(driver);
        initializeElements();
    }

    private void initializeElements() {
        addToCartButton = driver.findElement(By.cssSelector(".exclusive-item-list button.cart-button--button"));
        downloadPDF = driver.findElement(By.xpath("//a[text() = 'Download']"));

    }

    public CarPage addToCart() {
        addToCartButton.click();
        return this;
    }

    public CartPage goToCart() {
        header.clickOnCartIcon();
        return new CartPage(driver);
    }

    public void verifyPDF() throws InterruptedException {
        downloadPDF.click();
        Thread.sleep(5000);
        Assert.assertTrue(isFileDownloaded("C:/Users/masli/Downloads/", "etd_A6_Limousine_35_TDI_S_tronic_120_kW.pdf"));
    }

    public boolean isFileDownloaded(String downloadPath, String fileName) {
        boolean flag = false;
        File dir = new File(downloadPath);
        File[] dir_contents = dir.listFiles();

        for (int i = 0; i < dir_contents.length; i++) {
            if (dir_contents[i].getName().equals(fileName))
                return flag = true;
        }

        return flag;
    }

}
