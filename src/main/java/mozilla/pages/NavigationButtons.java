package mozilla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationButtons extends BasePage {

    //Elements

    @FindBy(id = "TabToolbar.backButton")
    private WebElement moveBackBtn;

    @FindBy(id = "TabToolbar.forwardButton")
    private WebElement moveForwardBtn;

    @FindBy(id = "TabToolbar.stopReloadButton")
    private WebElement refreshBtn;

    @FindBy(id = "TabToolbar.tabsButton")
    private WebElement tabsBtn;

    @FindBy(id = "TabToolbar.menuButton")
    private WebElement toolbarMenu;


    //Actions

    public void clickMoveBackBtn() {
        moveBackBtn.click();
    }

    public void clickMoveForwardBtn() {
        moveForwardBtn.click();
    }

    public void clickRefreshBtn() {
        refreshBtn.click();
    }

    public void cloclTabsBtn() {
        tabsBtn.click();
    }

    public void toolbarMenuBtnClick() {
        toolbarMenu.click();
    }

}
