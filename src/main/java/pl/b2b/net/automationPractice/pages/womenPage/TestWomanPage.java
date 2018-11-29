package pl.b2b.net.automationPractice.pages.womenPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pl.b2b.net.automationPractice.SingletonWebDriver;
import pl.b2b.net.automationPractice.pages.topsPage.ObjectTopsPage;

public class TestWomanPage {

    private SingletonWebDriver singletonWebDriver;
    private WebDriver webDriver;
    private WebDriverWait wait;
    private ObjectWomanPage objectWomanPage;
    private ObjectTopsPage objectTopsPage;


    @BeforeClass
    public void setUp() {
        singletonWebDriver = SingletonWebDriver.getInstance();
        webDriver = singletonWebDriver.getWebDriver();
        wait = singletonWebDriver.getWebDriverWait();
        objectWomanPage = new ObjectWomanPage(webDriver, wait);
        objectTopsPage = new ObjectTopsPage(webDriver, wait);
    }

    @Test
    public void goToTops() {
        objectWomanPage.clickTops();
        Assert.assertEquals(webDriver.getTitle(), "Tops - My Store");
    }

}
