package mozilla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SyncPage extends BasePage {

    //Elements

    @FindBy(id = "Done")
    private WebElement doneLeftUpCornerBtn;


    //Actions

    public void clickDoneLeftUpCornerBtn() {
        doneLeftUpCornerBtn.click();
    }

}
