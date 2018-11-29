package pl.b2b.net.automationPractice.pages.topsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pl.b2b.net.automationPractice.SingletonWebDriver;
import pl.b2b.net.automationPractice.pages.homePage.ObjectHomePage;

public class TestTopsPage {

    private SingletonWebDriver singletonWebDriver;
    private WebDriver webDriver;
    private WebDriverWait wait;
    private ObjectTopsPage objectTopsPage;


    @BeforeClass
    public void setUp() {
        singletonWebDriver = SingletonWebDriver.getInstance();
        webDriver = singletonWebDriver.getWebDriver();
        wait = singletonWebDriver.getWebDriverWait();
        objectTopsPage = new ObjectTopsPage(webDriver, wait);
    }

    @Test
    public void checkProductList() {
        Assert.assertEquals(objectTopsPage.getSizeList(), 2);
    }

//    @AfterClass
//    public void tearUp() {
//        webDriver.quit();
//    }
}
