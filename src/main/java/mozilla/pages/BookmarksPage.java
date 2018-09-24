package mozilla.pages;

import framework.utility.Driver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class BookmarksPage extends BasePage {

    private IOSDriver driver = Driver.getInstance().getDriver();
    TouchAction touchAction;


    //Elements

    @FindBy(xpath = "//*[@name='Bookmarks List']/XCUIElementTypeCell")
    private List<WebElement> bookmarksList;


    //Actions

    public List<String> getBookmarksNamesList() {
        List<String> bookmarksNamesList = new ArrayList<>();
        for(int i = 0; i < bookmarksList.size(); i++) {
            int num = i + 1;
            String XPATH = "//XCUIElementTypeTable[@name='Bookmarks List']/XCUIElementTypeCell[" + num + "]/XCUIElementTypeStaticText";
            String BookmarkName = driver.findElement(By.xpath(XPATH)).getAttribute("name");

            bookmarksNamesList.add(BookmarkName);
        }
        return bookmarksNamesList;
    }

    public void removeBookmarkItem(int num) {

            String XPATH = "//XCUIElementTypeTable[@name='Bookmarks List']/XCUIElementTypeCell[" + num + "]";
            int xOffset = driver.findElement(By.xpath(XPATH)).getLocation().getX();
            int yOffset = driver.findElement(By.xpath(XPATH)).getLocation().getY();
            touchAction = new TouchAction(Driver.getInstance().getDriver());
            touchAction.longPress(PointOption.point(310, yOffset)).waitAction().moveTo(PointOption.point(xOffset, yOffset)).release().perform();
        }
    }


