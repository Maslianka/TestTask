package tests.carPage;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.AudiBase;

public class C3_VerifyThatUserCanAddToCartAudiA6Sedan extends AudiBase {


    @Test
    @Description("Verify that user can add to cart Audi A6 Sedan")
    public void testVerifyThatUserCanAddToCartAudiA6Sedan() {
        String seriesName = "Audi A6",
                modelName = "Audi A6 Sedan",
                fullNameOfCar = "Audi A6 Sedan 35 TDI S tronic (120 kW)";

        openAudi()
                .selectCar(seriesName, modelName)
                .addToCart()
                .goToCart()
                .verifyAutoPresentInCart(fullNameOfCar);
    }
}
