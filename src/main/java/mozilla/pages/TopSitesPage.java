package mozilla.pages;

import framework.utility.Driver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class TopSitesPage extends BasePage {

    private IOSDriver driver = Driver.getInstance().getDriver();
    TouchAction touchAction;

    //Elements

    @FindBy(xpath = "(//XCUIElementTypeCell[@name='TopSite'])")
    private List<WebElement> topSitesList;

    @FindBy(id = "pageControl")
    private WebElement pageSwiper;

    @FindBy(id = "quick_action_new_tab")
    private WebElement openInNewTabBtn;

    @FindBy(id = "quick_action_new_private_tab")
    private WebElement openInNewPrivateTabBtn;

    @FindBy(id = "action_bookmark")
    private WebElement bookmarkBtn;

    @FindBy(id = "action_share")
    private WebElement shareBtn;

    @FindBy(id = "action_unpin")
    private WebElement removeTopSiteBtn;


    //Actions

    public void swipeTopSitesPages() {
        pageSwiper.click();
    }

    public List<String> getTopSitesList() {
        List<String> topSitesList = new ArrayList<>();
        if (pageSwiper.isDisplayed()) {
            for (int i = 1; i <= topSitesList.size(); i++) {
                int num = i;
                String XPATH = "(//XCUIElementTypeCell[@name='TopSite'])[" + num + "]";
                String topSiteName = driver.findElement(By.xpath(XPATH)).getAttribute("label");
                topSitesList.add(topSiteName);
                if (i == 8) {
                    swipeTopSitesPages();
                    i = 1;
                }
            }
        }
        else {
            for (int i = 1; i <= topSitesList.size(); i++) {
                int num = i;
                String XPATH = "(//XCUIElementTypeCell[@name='TopSite'])[" + num + "]";
                String topSiteName = driver.findElement(By.xpath(XPATH)).getAttribute("label");
                topSitesList.add(topSiteName);
            }
        }
        return topSitesList;
    }

    public void longPressOnTopSiteIco(int num) {
        String XPATH = "(//XCUIElementTypeCell[@name='TopSite'])[" + num + "]";
        int xOffset = driver.findElement(By.xpath(XPATH)).getLocation().getX();
        int yOffset = driver.findElement(By.xpath(XPATH)).getLocation().getY();
        touchAction = new TouchAction(Driver.getInstance().getDriver());
        touchAction.longPress(PointOption.point(xOffset, yOffset)).waitAction().perform();
    }

    public void openInNewTab() {
        openInNewTabBtn.click();
    }

    public void openInNewPrivateTab() {
        openInNewPrivateTabBtn.click();
    }

    public void bookmarkThis() {
        bookmarkBtn.click();
    }

    public void shareThis() {
        shareBtn.click();
    }

    public void removeTopSite() {
        removeTopSiteBtn.click();
    }

}
