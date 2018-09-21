package mozilla.pages;

import org.glassfish.grizzly.compression.lzma.impl.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SyncPage extends BasePage {

    //Elements
    @FindBy(id = "Done")
    private WebElement DoneLeftUpCornerBtn;

    public void doneLeftUpCornerBtnClick() {
        DoneLeftUpCornerBtn.click();
    }
}
