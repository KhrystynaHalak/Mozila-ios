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

    //@FindBy(xpath = "//*[@name=\"How to Make Healthy Eating Choices While Traveling, read, goodnet.org\"]")
    //@FindBy(id = "goodnet.org")
    //@FindBy (xpath = "//*[@id = 'MarkAsRead'] and //*[@id = 'MarkAsUnread']")
    //private List<WebElement> ReadingListItem;

    @FindBy(id = "MarkAsUnread")
    public List<WebElement> UnreadBtn;

    @FindBy(id = "MarkAsRead")
    public List<WebElement> ReadBtn;

    @FindBy(xpath = "(//*[@name=\"Remove\"])[1]")
    private WebElement RemoveBtn;

    //Actions

    public boolean getreadingListItem(String siteAdress) {
        boolean elementIsPresent = false;
        if (Driver.getInstance().getDriver().findElement(By.xpath("//*[contains(@name, '" + siteAdress + ".org')]")).isEnabled()) {
            elementIsPresent = true;
        }
        return elementIsPresent;
    }

    public void unreadBtnClick() {
        UnreadBtn.get(0).click();
    }

    public void readBtnClick() {

        //WebDriverWait wait = new WebDriverWait(Driver.getInstance().getDriver(), 60);

        //WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.id("MarkAsRead")));
        //el.click();

        touchAction = new TouchAction(Driver.getInstance().getDriver());
        touchAction.tap(PointOption.point(16, 145)).perform();
    }

    public void deleteReadingListItemBySwipe() {
        /*if (ReadBtn.get(0).isDisplayed()) {
            int x = ReadBtn.get(0).getLocation().getX();
            int y = ReadBtn.get(0).getLocation().getY();

            touchAction = new TouchAction(Driver.getInstance().getDriver());
            touchAction.longPress(PointOption.point(x, y)).waitAction().moveTo(PointOption.point(0, y)).release().perform();
        } else if (UnreadBtn.get(0).isDisplayed()) {
            int x = UnreadBtn.get(0).getLocation().getX();
            int y = UnreadBtn.get(0).getLocation().getY();

            touchAction = new TouchAction(Driver.getInstance().getDriver());
            touchAction.longPress(PointOption.point(x, y)).waitAction().moveTo(PointOption.point(0, y)).release().perform();
        }*/

        for (int i = 0; readingItemsCount() > 0; i++)
        {
            touchAction = new TouchAction(Driver.getInstance().getDriver());
            touchAction.longPress(PointOption.point(259, 116)).waitAction().moveTo(PointOption.point(91, 116)).release().perform();
            RemoveBtn.click();
        }

        //touchAction.tap(PointOption.point(195, 116)).perform();
    }

    public Integer readBtnsCount() {
        return ReadBtn.size();
    }

    public Integer readingItemsCount() {
        return ReadBtn.size() + UnreadBtn.size();
    }
}
