package mozilla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SyncPage {

    //Elements
    @FindBy(id = "Done")
    private WebElement DoneLeftUpCornerBtn;

    public void doneLeftUpCornerBtnClick() {
        DoneLeftUpCornerBtn.click();
    }
}
