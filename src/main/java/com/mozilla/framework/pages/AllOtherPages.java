package com.mozilla.framework.pages;

import com.mozilla.framework.utility.Driver;
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
    private WebElement keyBoardGoBtn;

    @FindBy(id = "TabLocationView.pageOptionsButton")
    private WebElement threeDotsBtn;

    @FindBy(xpath = "//*[@name='TabLocationView.readerModeButton']")
    private WebElement bookingListBtn;

    @FindBy(xpath = "//*[@label = 'Add to Reading List']")
    private WebElement addToBookingListBtn;

    @FindBy(xpath = "//*[@label = 'Remove from Reading List']")
    private WebElement deleteFromReadingListBtn;

    //Actions
    public void clickKeyBoardGoBtn() {
        keyBoardGoBtn.click();
    }

    public void clickThreeDotsBtn() {
        threeDotsBtn.click();
    }

    public void markAsBookingListItem() {
        bookingListBtn.click();
    }

    public void clickAddToBookingList() {
        try {
            if (addToBookingListBtn.isDisplayed()) {
                addToBookingListBtn.click();
            }
        } catch (NoSuchElementException | StaleElementReferenceException e) {
            System.out.println("Add to booking list button is not present, script continues to execute");
        }
    }

    public Integer addToBookingListCount() {

        int addCounter = 0;
        if (addToBookingListBtn.getAttribute("enabled").equals("true")) {
            return ++addCounter;
        } else {
            return addCounter;
        }
    }

    public void scrollDownAPage() {
        touchAction = new TouchAction(Driver.getInstance().getDriver());
        touchAction.longPress(PointOption.point(1, 486))
                .moveTo(PointOption.point(40, 100))
                .waitAction()
                .release()
                .perform();
    }

}
