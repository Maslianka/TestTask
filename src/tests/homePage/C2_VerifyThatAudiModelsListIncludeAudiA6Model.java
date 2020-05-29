package tests.homePage;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.AudiBase;

public class C2_VerifyThatAudiModelsListIncludeAudiA6Model extends AudiBase {


    @Test
    @Description("Verify that Audi Models List include Audi A6 model")
    public void testVerifyThatAudiModelsListIncludeAudiA6Model() {
        openAudi()
                .verifyListOfModels("Audi A6");
    }

    @Test
    @Description("Verify that Audi Models List include Audi A6 model INVALID FLOW")
    public void testVerifyThatAudiModelsListIncludeAudiA6ModelNEGATOVE() {
        openAudi()
                .verifyListOfModels("Audji A6");
    }
}
