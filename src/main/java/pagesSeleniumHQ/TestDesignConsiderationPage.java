package pagesSeleniumHQ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestDesignConsiderationPage {
    private WebDriver driver;

    public TestDesignConsiderationPage(WebDriver driver){
        this.driver = driver;
    }

    private By pageObjectDesignPatternHeadline = By.xpath("//div[@id='page-object-design-pattern']/h2");

    public String pageObjectDesignPatternHeadlineString(){
        return driver.findElement(pageObjectDesignPatternHeadline).getText();
    }
}

