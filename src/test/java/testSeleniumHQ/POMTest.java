package testSeleniumHQ;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pagesSeleniumHQ.DocumentationPage;
import pagesSeleniumHQ.HomePage;
import pagesSeleniumHQ.TestDesignConsiderationPage;
public class POMTest {

    WebDriver driver;

    @Before
    public void setUp(){
    	System.setProperty("webdriver.gecko.driver", "D:/Drivers/geckodriver.exe");
    	driver = new FirefoxDriver();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://www.seleniumhq.org/");
    }

    @Test
    public void testRun(){

        HomePage hp = new HomePage(driver);
        DocumentationPage dp = hp.documentationLinkClick();
        TestDesignConsiderationPage tdcp = dp.testDesignConsiderationClick();
        String expected = tdcp.pageObjectDesignPatternHeadlineString();
        String actual = "Page Object Design Patter";

        Assert.assertEquals(expected,actual);
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
