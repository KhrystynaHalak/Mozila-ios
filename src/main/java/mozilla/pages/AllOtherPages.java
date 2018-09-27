package mozilla.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllOtherPages extends HomePage {

    //Elements
    @FindBy(xpath = "//*[@name='Go']")
    private WebElement KeyBoardGoBtn;

    @FindBy(id = "TabLocationView.pageOptionsButton")
    private WebElement threeDotsBtn;

    @FindBy(xpath = "//*[@name=\"TabLocationView.readerModeButton\"]")
    private WebElement BookingListBtn;

    @FindBy(xpath = "//*[@label = 'Add to Reading List']")
    private WebElement AddToBookingListBtn;

    @FindBy(xpath = "//*[@label = 'Remove from Reading List']")
    private WebElement DeleteFromReadingListBtn;

    //Actions
    public void keyBoardGoBtnClick() {
        KeyBoardGoBtn.click();
    }

    public void threeDotsBtnClick() {
        threeDotsBtn.click();
    }

    public void markAsBookingListItem() {BookingListBtn.click();}

    public void addToBookingListClick() {
        try {
            if (AddToBookingListBtn.isDisplayed()) {
                AddToBookingListBtn.click();
            }
        }
        catch (NoSuchElementException | StaleElementReferenceException e) {
            System.out.println("Add to booking list button is not present, script continues to execute");
        }
    }

    public Integer addToBookingListCount() {

        int addCounter = 0;
        return AddToBookingListBtn.isDisplayed()? addCounter++ : addCounter;
    }

}
