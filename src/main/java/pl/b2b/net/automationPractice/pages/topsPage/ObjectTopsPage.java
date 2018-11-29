package pl.b2b.net.automationPractice.pages.topsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pl.b2b.net.automationPractice.pages.homePage.DataHomePage;

import java.util.List;

public class ObjectTopsPage {

    private WebDriver webDriver;
    private WebDriverWait wait;

    public ObjectTopsPage(WebDriver webDriver, WebDriverWait wait) {
        this.webDriver = webDriver;
        this.wait = wait;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = DataTopsPage.TOPS_ASSERT)
    private WebElement topsAssert;

    @FindAll(@FindBy(xpath = DataTopsPage.PRODUCT_LIST))
    List<WebElement> lista;

    public WebElement getTopsAssert() {
        return topsAssert;
    }

    public int getSizeList() {
        return lista.size();
    }

}
