package mozilla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookmarksPage {

    @FindBy(xpath = "//XCUIElementTypeTable[@name='BookmarksPage List']/XCUIElementTypeCell")
    private WebElement FirstBookmark;


    public String  getBookmarkName() {
        return FirstBookmark.getText();
    }
}
