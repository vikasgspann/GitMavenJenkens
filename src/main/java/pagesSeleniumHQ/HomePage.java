package pagesSeleniumHQ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    private By documentationLink = By.xpath("//li[@id='menu_documentation']/a[@href='/docs/']");

    public DocumentationPage documentationLinkClick(){
        driver.findElement(documentationLink).click();
        return new DocumentationPage(driver);
    }

}

