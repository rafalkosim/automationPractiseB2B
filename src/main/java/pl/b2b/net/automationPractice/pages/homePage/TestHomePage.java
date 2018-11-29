package pl.b2b.net.automationPractice.pages.homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import pl.b2b.net.automationPractice.SingletonWebDriver;

import javax.xml.crypto.Data;

public class TestHomePage {

    private SingletonWebDriver singletonWebDriver;
    private WebDriver webDriver;
    private WebDriverWait wait;
    private ObjectHomePage objectHomePage;

    @BeforeClass
    public void setUp() {
        singletonWebDriver = SingletonWebDriver.getInstance();
        webDriver = singletonWebDriver.getWebDriver();
        wait = singletonWebDriver.getWebDriverWait();
        objectHomePage = new ObjectHomePage(webDriver, wait);
    }

    @Test(priority = 1)
//    @TestFactoryMethod(value = "OTWARCIE PRZEGLADARKI", description ="Przegladarka Chrome", group = "configs")
    public void openStore() {
        webDriver.get(DataHomePage.URL);
        Assert.assertEquals(webDriver.getTitle(), "My Store");
    }

    @Test(priority = 2)
//    @TestFactoryMethod(value = "ZAKLADKA OPEN", description ="Klik w zakladke OPEN", group = "PodStrony")
    public void goToWomenPage() {
        objectHomePage.clickWomenPage();
        Assert.assertEquals(webDriver.getTitle(), "Women - My Store");
    }

    @Test(priority = 3)
    @Parameters({"name"})
    public void goToCategoryDresses(@Optional("Women") String name) {
        objectHomePage.clickCategories(name);
        Assert.assertTrue(webDriver.getTitle().contains(name));
    }
}