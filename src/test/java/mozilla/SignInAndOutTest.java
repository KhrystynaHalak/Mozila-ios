package mozilla;

import org.testng.Assert;
import org.testng.annotations.Test;

import org.openqa.selenium.NoSuchElementException;

public class SignInAndOutTest extends BaseTest {
    private static final String email = "20littlejohnny16@gmail.com";
    private static final String password = "1234567890";

    @Test
    public void signInAndOutTest() {
        navigationButtons.toolbarMenuBtnClick();
        tabToolbarMenuPage.settingsBtnClick();
        settingsPage.getSignInMoreInfoBtn().click();
        try {
            signInPage.getEmailField().sendKeys(email);
        } catch (NoSuchElementException e) {
            //NOOP
        }
        signInPage.getPaswwordField().sendKeys(password);
        signInPage.getSubmitBtn().click();
        Assert.assertEquals(settingsPage.getUserEmailLbl().getText(), email);
        settingsPage.getSignInMoreInfoBtn().click();
        firefoxAccountPage.getSingOutBtn().click();
        firefoxAccountPage.getDisconnectBtn().click();
    }
}
