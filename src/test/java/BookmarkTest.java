import framework.utility.TestRunner;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class BookmarkTest extends TestRunner {

    @Test
    public void Basic() {
        //driver.findElement(By.xpath("//*[@name='HomePanels.Downloads']")).click();
        //driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeButton[5]")).click();

/*
        homePage.downloadsBtnClick();
        homePage.fauvoritesBtnClick();
        homePage.tabToolbarBtnClick();
        tabToolbarMenuPage.closeBtnClick();
*/
        homePage.clickOnURL();
        homePage.enterURL("https://www.apple.com");
        String expected = "Apple";
        allOtherPages.threeDotsBtnClick();
        allOtherPages.bookmarkThisPageBtnClick();
        allOtherPages.tabToolbarBtnClick();
        tabToolbarMenuPage.bookmarksBtnClick();
        String actual = bookmarksPage.getBookmarkName();
        Assert.assertTrue(actual.contains(expected));

    }

}
