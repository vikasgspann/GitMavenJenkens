package pagesSeleniumHQ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DocumentationPage {
    private WebDriver driver;

    public DocumentationPage(WebDriver driver){
        this.driver = driver;
    }

    private By testDesignConsiderationsLink = By.xpath("//a[text()='Test Design Considerations']");

    public TestDesignConsiderationPage testDesignConsiderationClick(){
        driver.findElement(testDesignConsiderationsLink).click();
        return new TestDesignConsiderationPage(driver);
    }

}
