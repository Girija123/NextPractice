package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PLPage {

    public WebDriver driverHere;

    public PLPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        this.driverHere = driver;
    }


    public void chooseProduct(String productName)
    {
        driverHere.findElement(By.xpath("//span[normalize-space(text())='"+productName+"']")).click();
    }
}
