package mozilla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookmarksPage {

    //Elements

    @FindBy(xpath = "//XCUIElementTypeTable[@name='BookmarksPage List']/XCUIElementTypeCell")
    private WebElement FirstBookmark;

    //Actions

    public String  getBookmarkName() {
        return FirstBookmark.getText();
    }
}
