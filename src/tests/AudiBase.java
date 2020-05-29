package tests;

import utils.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AudiBase extends Driver {
    @BeforeMethod
    public void setUp() {
        openChrome();
        openAudi();
    }


    @AfterMethod(alwaysRun = true)
    protected void closeBrowser() {
        driver.quit();
    }
}
