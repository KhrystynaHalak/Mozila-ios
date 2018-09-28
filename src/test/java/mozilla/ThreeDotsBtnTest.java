package mozilla;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

import static org.testng.Assert.assertTrue;

public class ThreeDotsBtnTest extends BaseTest {
    @Test
    public void checkSharePageBtnTest() {
        homePage.enterURL("https://www.google.com.ua/");
        allOtherPages.keyBoardGoBtnClick();
        allOtherPages.threeDotsBtnClick();
        threeDotsPage.sharePageWithBtnClick();
        assertTrue(shareWithPage.getPage().isDisplayed());
        assertTrue(shareWithPage.getRemindersBtn().isDisplayed());
        assertTrue(shareWithPage.getMoreBtn().isDisplayed());
        assertTrue(shareWithPage.getCopyBtn().isDisplayed());
        assertTrue(shareWithPage.getPrintBtn().isDisplayed());
        assertTrue(shareWithPage.getCreateBtn().isDisplayed());
        assertTrue(shareWithPage.getMoreBtn2().isDisplayed());
        assertTrue(shareWithPage.getCloseBtn().isDisplayed());
        shareWithPage.getCloseBtn().click();
    }

    @Test
    public void addAndRemoveBookmarkTest() {
        boolean success = false;
        homePage.enterURL("https://www.google.com.ua/");
        allOtherPages.keyBoardGoBtnClick();
        allOtherPages.threeDotsBtnClick();
        threeDotsPage.bookmarkThisPageBtnClick();
        navigationButtons.toolbarMenuBtnClick();
        tabToolbarMenuPage.bookmarksBtnClick();
        for(Map.Entry<String, WebElement> entry: bookmarksPage.getBookmarksElementsWithXpath().entrySet()) {
           if(entry.getValue().getAttribute("name").equals("Google")) {
               bookmarksPage.deleteElementByXpath(entry.getKey());
               success = true;
           }
        }
        Assert.assertTrue(success);
    }
}
