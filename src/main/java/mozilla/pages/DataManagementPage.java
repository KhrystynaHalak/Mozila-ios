package mozilla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DataManagementPage extends BasePage {

    //Elements

    @FindBy(id = "Data Management")
    private WebElement DataManagementBtn;

    @FindBy (xpath = "(//*[@name=\"Clear Private Data\"])[2]")
    private WebElement RemoveBtn;

    //Actions

    public void dataManagementClick(){
        DataManagementBtn.click();
    }

    public void removeClick() {
        RemoveBtn.click();
    }

}
