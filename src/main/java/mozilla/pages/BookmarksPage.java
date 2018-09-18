package mozilla.pages;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookmarksPage extends BasePage {

    // Init Page
    public BookmarksPage(IOSDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Elements

    @FindBy(xpath = "//*[@name='menu-panel-Bookmarks']")
    private WebElement FirstBookmark;

    //Actions

    public String getBookmarkName() {
        return FirstBookmark.getText();
    }
}
