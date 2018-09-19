package mozilla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationButtons extends BasePage {

    //Elements
    @FindBy(id = "TabToolbar.backButton")
    private WebElement MoveBackBtn;

    @FindBy(id = "TabToolbar.forwardButton")
    private WebElement MoveForwardBtn;

    @FindBy(id = "TabToolbar.stopReloadButton")
    private WebElement RefreshBtn;

    @FindBy(id = "TabToolbar.tabsButton")
    private WebElement TabsBtn;

    //Actions
    public void moveBackBtnClick() {
        MoveBackBtn.click();
    }

    public void moveForwardBtnClick() {
        MoveForwardBtn.click();
    }

    public void refreshBtnClick() {
        RefreshBtn.click();
    }

    public void tabsBtnClick() {
        TabsBtn.click();
    }

}
