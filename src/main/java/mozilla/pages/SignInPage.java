package mozilla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage{
    @FindBy(xpath = "(//XCUIElementTypeOther[@name=\"Sign in to continue to Firefox Sync\"])[1]/XCUIElementTypeTextField")
    private WebElement emailField;

    @FindAll({@FindBy(xpath = "(//XCUIElementTypeOther[@name=\"Sign in to continue to Firefox Sync\"])[1]/XCUIElementTypeOther[3]/XCUIElementTypeSecureTextField"),
    @FindBy(xpath = "(//XCUIElementTypeOther[@name=\"Sign in to continue to Firefox Sync\"])[1]/XCUIElementTypeOther[5]/XCUIElementTypeSecureTextField")})
    private WebElement paswwordField;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Sign in\"]")
    private WebElement submitBtn;

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPaswwordField() {
        return paswwordField;
    }

    public WebElement getSubmitBtn() {
        return submitBtn;
    }
}
