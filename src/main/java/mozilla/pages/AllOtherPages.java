package mozilla.pages;

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

    @FindBy(id = "ReaderModeBarView.listStatusButton")
    private WebElement AddToBookingListBtn;


    //Actions
    public void keyBoardGoBtnClick() {
        KeyBoardGoBtn.click();
    }

    public void threeDotsBtnClick() {
        threeDotsBtn.click();
    }

    public void markAsBookingListItem() {BookingListBtn.click();}

    public void addToBookingListClick() {AddToBookingListBtn.click();}

}
