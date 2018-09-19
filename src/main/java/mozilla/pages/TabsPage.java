package mozilla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TabsPage extends BasePage {

    //Elements
    @FindBy(id = "TabTrayController.removeTabsButton")
    private WebElement DeleteTabBtn;

    @FindBy(id = "TabTrayController.addTabButton")
    private WebElement AddNewTabBtn;

    @FindBy(id = "TabTrayController.maskButton")
    private WebElement PrivateBrowsingBtn;

    @FindBy(id = "TabTrayController.deleteButton.closeAll")
    private WebElement CloseAllTabsBtn;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name='Fennec (andrew)']/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeSheet/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther")
    private WebElement CancelBtn;

    //Actions
    public void deleteTabBtnClick() {
        DeleteTabBtn.click();
    }

    public void addNewTabBtnClick() {
        AddNewTabBtn.click();
    }

    public void privateBrowsingBtn() {
        PrivateBrowsingBtn.click();
    }

    public void closeAllTabsBtn() {
        CloseAllTabsBtn.click();
    }

    public void cancelBtnClick() {
        CancelBtn.click();
    }

}
