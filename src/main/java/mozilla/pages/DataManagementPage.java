package mozilla.pages;

import framework.utility.Driver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

import static framework.utility.Driver.*;

public class DataManagementPage extends BasePage {

    TouchAction touchAction;
    //Elements

    @FindBy(id = "Data Management")
    private WebElement DataManagementBtn;

    @FindBy (xpath = "(//*[@name=\"Clear Private Data\"])[2]")
    private WebElement RemoveBtn;

    //Actions

    public void dataManagementClick(){
        scrollDownAPage();
        DataManagementBtn.click();
    }

    public void removeClick() {
        RemoveBtn.click();
    }

    public void scrollDownAPage() {
        touchAction = new TouchAction(Driver.getInstance().getDriver());
        touchAction.longPress(PointOption.point(20, 50))
                .waitAction()
                .moveTo(PointOption.point(40, 486))
                //.waitAction()
                .release()
                .perform();

        //Driver.getInstance().getDriver().executeScript("arguments[0].scrollIntoView();", DataManagementBtn);

    }
}
