package mozilla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookmarksPage extends BasePage {

    //Elements

    @FindBy(xpath = "//*[@name='menu-panel-Bookmarks']")
    private WebElement FirstBookmark;

    //Actions

    public String getBookmarkName() {
        return FirstBookmark.getText();
    }
}
