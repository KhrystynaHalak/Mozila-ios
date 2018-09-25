package mozilla.pages;

import framework.utility.Driver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class ReadingListPage extends BasePage{

    HomePage homePage = new HomePage();
    TouchAction touchAction;


    //Elements

    //@FindBy(xpath = "//*[@name=\"How to Make Healthy Eating Choices While Traveling, read, goodnet.org\"]")
    //@FindBy(id = "goodnet.org")
    //@FindBy (xpath = "//*[@id = 'MarkAsRead'] and //*[@id = 'MarkAsUnread']")
    //private List<WebElement> ReadingListItem;

    @FindBy(id = "MarkAsUnread")
    private WebElement UnreadBtn;

    @FindBy(id = "MarkAsRead")
    public List<WebElement> ReadBtn;


    //Actions

    public boolean getreadingListItem(String siteAdress) {
        boolean elementIsPresent = false;
        if(Driver.getInstance().getDriver().findElement(By.xpath("//*[contains(@name, '" + siteAdress + ".org')]")).isEnabled()) {
            elementIsPresent = true;
        }
        return elementIsPresent;
    }

    public void unreadBtnClick() {
        UnreadBtn.click();
    }

    public void readBtnClick(){

        //WebDriverWait wait = new WebDriverWait(Driver.getInstance().getDriver(), 60);

        //WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.id("MarkAsRead")));
        //el.click();

        touchAction = new TouchAction(Driver.getInstance().getDriver());
        touchAction.tap(PointOption.point(16, 145)).perform();
    }

    public Integer readBtnsCount(){
        return ReadBtn.size();
    }
}
