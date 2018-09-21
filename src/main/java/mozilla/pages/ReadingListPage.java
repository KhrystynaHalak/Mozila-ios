package mozilla.pages;

import framework.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.LinkedHashMap;
import java.util.List;

public class ReadingListPage extends BasePage{

    WebDriverWait wait = new WebDriverWait(Driver.getInstance().getDriver(), 20);

    //Elements

    @FindBy(xpath = "//*[@name=\"How to Make Healthy Eating Choices While Traveling, read, goodnet.org\"]")
    private List<WebElement> ReadingListItem;

    @FindBy(id = "MarkAsUnread")
    private WebElement UnreadBtn;

    @FindBy(xpath = "//*[@name=\"MarkAsRead\"]")
    public List<WebElement> ReadBtn;

    //Actions

    public Integer readingListItemsCount() {
        return ReadingListItem.size();
    }

    public void unreadBtnClick() {
        UnreadBtn.click();
    }

    public void readBtnClick(){

        wait.until(ExpectedConditions.elementToBeClickable(ReadBtn.get(0)));
        ReadBtn.get(0).click();
    }

    public Integer readBtnsCount(){
        return ReadBtn.size();
    }
}
