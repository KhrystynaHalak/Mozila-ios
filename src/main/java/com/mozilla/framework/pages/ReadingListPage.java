package com.mozilla.framework.pages;

import com.mozilla.framework.utility.Driver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ReadingListPage extends BasePage {

    HomePage homePage = new HomePage();
    TouchAction touchAction;


    //Elements

    @FindBy(id = "MarkAsUnread")
    public List<WebElement> UnreadBtn;

    @FindBy(id = "MarkAsRead")
    public List<WebElement> ReadBtn;

    @FindBy(xpath = "(//*[@name='Remove'])[1]")
    private WebElement removeBtn;


    //Actions

    public boolean getreadingListItem(String siteAdress) {
        boolean elementIsPresent = false;
        if (Driver.getInstance().getDriver().findElement(By.xpath("//*[contains(@name, '" + siteAdress + ".org')]")).isEnabled()) {
            elementIsPresent = true;
        }
        return elementIsPresent;
    }

    public void clickUnreadBtn() {
        UnreadBtn.get(0).click();
    }

    public void clickReadBtn() {

        touchAction = new TouchAction(Driver.getInstance().getDriver());
        touchAction.tap(PointOption.point(16, 145)).perform();
    }

    public void deleteReadingListItemBySwipe() {

        for (int i = 0; countReadingItems() > 0; i++)
        {
            touchAction = new TouchAction(Driver.getInstance().getDriver());
            touchAction.longPress(PointOption.point(259, 116)).waitAction().moveTo(PointOption.point(91, 116)).release().perform();
            removeBtn.click();
        }
    }

    public Integer countReadBtns() {
        return ReadBtn.size();
    }

    public Integer countReadingItems() {
        return ReadBtn.size() + UnreadBtn.size();
    }
}
