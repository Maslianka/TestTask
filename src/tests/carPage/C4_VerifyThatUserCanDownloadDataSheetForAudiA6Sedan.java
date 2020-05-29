package tests.carPage;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.AudiBase;

public class C4_VerifyThatUserCanDownloadDataSheetForAudiA6Sedan extends AudiBase {

    @Test
    @Description("Verify that user can Download data sheet for Audi A6 Sedan")
    public void testVerifyThatUserCanDownloadDataSheetForAudiA6Sedan() throws InterruptedException {

        String seriesName = "Audi A6",
                modelName = "Audi A6 Sedan";


        openAudi()
                .selectCar(seriesName,modelName)
                .verifyPDF();
    }
}
