package tests.login;

import com.sun.org.glassfish.gmbal.Description;
import org.testng.annotations.Test;
import tests.AudiBase;

public class C1_LogInToAccount extends AudiBase {


    @Test
    @Description("This test case verify Log in to the account with valid flow")
    public void testLogInToAccount() {
        openAudi()
                .clickLogInIcon()
                .setName("")
                .setPasswordField("")
                .clickSignIn()
                .clickProfileIcon()
                .verifyUserLoggedIn();

    }
}
