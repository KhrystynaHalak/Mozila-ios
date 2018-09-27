package mozilla.pages;

import framework.utility.Driver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllOtherPages extends HomePage {

    TouchAction touchAction;
    //Elements
    @FindBy(xpath = "//*[@name='Go']")
    private WebElement KeyBoardGoBtn;

    @FindBy(id = "TabLocationView.pageOptionsButton")
    private WebElement threeDotsBtn;


    @FindBy(xpath = "//*[@name=\"TabLocationView.readerModeButton\"]")
    private WebElement BookingListBtn;

    @FindBy(xpath = "//*[@label = 'Add to Reading List']")
    private WebElement AddToBookingListBtn;

    /*@FindBy(xpath = "//*[@name=\"ReaderModeBarView.listStatusButton\"]")
    private WebElement BookAddBtn;*/

    @FindBy(xpath = "//*[@label = 'Remove from Reading List']")
    private WebElement DeleteFromReadingListBtn;


    //Actions
    public void keyBoardGoBtnClick() {
        KeyBoardGoBtn.click();
    }

    public void threeDotsBtnClick() {
        threeDotsBtn.click();
    }

    public void markAsBookingListItem() {
        BookingListBtn.click();
    }

    public void addToBookingListClick() {
        try {
            if (AddToBookingListBtn.isDisplayed()) {
                AddToBookingListBtn.click();
            }
        } catch (NoSuchElementException | StaleElementReferenceException e) {
            System.out.println("Add to booking list button is not present, script continues to execute");
        }
    }

    public Integer addToBookingListCount() {

        int addCounter = 0;
        if (AddToBookingListBtn.getAttribute("enabled").equals("true")) {
            return ++addCounter;
        } else {
            return addCounter;
        }
    }

    public void scrollDownAPage() {
        touchAction = new TouchAction(Driver.getInstance().getDriver());
        touchAction.press(PointOption.point(15, 77))
                .moveTo(PointOption.point(15, 486))
                .waitAction()
                .release()
                .perform();
    }

}
