package mozilla.pages;

import framework.utility.Driver;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class DownloadsPage extends BasePage {

    TouchAction touchAction;


    //Elements

    @FindBy(id = "Microsoft Word Document icon test.docx")
    private WebElement docToDownload;

    @FindBy(id = "linkContextMenu.download")
    private WebElement downloadLinkBtn;

    @FindBy(id = "download")
    private WebElement downloadNowBtn;

    @FindBy(xpath = "//*[@name='DownloadsTable']/XCUIElementTypeCell")
    private List<WebElement> downloadedItems;

    @FindBy(id = "Downloads")
    private WebElement downloadAppearingBtn;


    //Actions

    public void clickDocToDownload() {
        touchAction = new TouchAction(Driver.getInstance().getDriver());
        touchAction.longPress(PointOption.point(13, 280)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000))).release().perform();
    }

    public void clickDownloadLinkBtn() {
        clickDocToDownload();
        downloadLinkBtn.click();
    }

    public void clickDownloadNowBtn() {
        downloadNowBtn.click();
    }

    List<WebElement> listTwo;

    public List<WebElement> getListOne() {
        touchAction = new TouchAction(Driver.getInstance().getDriver());
        listTwo = new ArrayList<>();

        try {
            for (int k = 0; k <= listTwo.size(); k++) {
                int i = k + 1;
                listTwo.add(Driver.getInstance().getDriver().findElementByXPath("//*[@name=\"DownloadsTable\"]/XCUIElementTypeCell[" + i + "]"));

                if (i % 7 == 0) {
                    touchAction.longPress(PointOption.point(50, 100))
                            .waitAction()
                            .moveTo(PointOption.point(50, 400))
                            .release()
                            .perform();

                    listTwo.add(Driver.getInstance().getDriver().findElementByXPath("//*[@name=\"DownloadsTable\"]/XCUIElementTypeCell[" + i + "]"));
                }
            }
        }
        catch (Exception e) {
                    System.out.println("Hello");
                }

        return listTwo;
    }

    public int countDownloadedItems() {
        //return downloadedItems.size();

        return getListOne().size();
    }

    public void clickDownloadAppearingBtn() {
        downloadAppearingBtn.click();
    }

}
