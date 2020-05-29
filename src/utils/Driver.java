package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class Driver {

    public static String audiDomainURL = Utils.URL;

    protected Driver(){}

    protected Driver(WebDriver driver){
        this.driver = driver;
    }

    protected WebDriver driver;


    protected void openChrome() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/masli/.m2/repository/webdriver/chromedriver/win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
    }

    protected HomePage openAudi() {
        Reporter.log("Open Audi home page");
        driver.get(audiDomainURL);
        return new HomePage(driver);
    }
}
