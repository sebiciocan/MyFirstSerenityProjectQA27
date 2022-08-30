package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

public class LoginTest extends BaseTest{


    @Test
    public void loginWithValidCredentialsTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail(Constants.USER_EMAIl);
        loginSteps.setPassword(Constants.USER_PASS);
        loginSteps.clickLogin();
        loginSteps.verifyUserIsLoggedIn("Cosmin Fas");
    }

    @Test
    public void loginWithInvalidPasswordTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail(Constants.USER_EMAIl);
        loginSteps.setPassword(Constants.USER_PASS);
        loginSteps.clickLogin();
        loginSteps.verifyUserNotLoggedIn();
    }


}
