package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import pages.Controls.Header;
import pages.Controls.ModalWindow;
import utils.Driver;

public class HomePage extends Driver {

    Header header = new Header(driver);

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public ModalWindow clickLogInIcon() {
        header.clickOnLogInIcon();
        return new ModalWindow(driver);
    }

    public MyProfile clickProfileIcon() {
        header.goToProfile();
        return new MyProfile(driver);
    }

    public ModalWindow clickSearchIcon() {
        Reporter.log("Click on Search");
        header.clickOnSearchIcon();
        return new ModalWindow(driver);
    }

    public CartPage clickCartIcon() {
        header.clickOnCartIcon();
        return new CartPage(driver);
    }

    public HomePage verifyListOfModels(String model){
        Assert.assertTrue(header.getListOfModels().contains(model),model + " not found");
        return this;
    }

    public CarPage selectCar(String s, String d) {
        header.selectModel(s,d);
        return new CarPage(driver);
    }
}
