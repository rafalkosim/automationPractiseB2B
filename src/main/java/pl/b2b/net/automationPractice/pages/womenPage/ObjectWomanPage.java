package pl.b2b.net.automationPractice.pages.womenPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pl.b2b.net.automationPractice.pages.topsPage.DataTopsPage;

public class ObjectWomanPage {

    private WebDriver webDriver;
    private WebDriverWait wait;

    public ObjectWomanPage(WebDriver webDriver, WebDriverWait wait) {
        this.webDriver = webDriver;
        this.wait = wait;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = DataWomenPage.TOPS)
    private WebElement clickTops;

    public void clickTops() {
        wait.until(ExpectedConditions.elementToBeClickable(clickTops));
        clickTops.click();
    }
}
