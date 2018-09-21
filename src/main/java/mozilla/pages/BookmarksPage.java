package mozilla.pages;

import framework.utility.Driver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class BookmarksPage extends BasePage {

    private IOSDriver driver = Driver.getInstance().getDriver();

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
}
