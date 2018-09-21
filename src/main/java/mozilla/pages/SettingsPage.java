package mozilla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingsPage extends BasePage {

    //Elements
    @FindBy(id = "AppSettingsTableViewController.navigationItem.leftBarButtonItem")
    private WebElement DoneLeftUpCornerBtn;

    //Actions
    public void doneLeftUpCornerBtnClick() { DoneLeftUpCornerBtn.click(); }
}