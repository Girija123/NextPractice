package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasketPage {

    public BasketPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="")
    public WebElement productInBag;

    public void validateProductInBag(String expectedProduct)
    {
        String actualProduct = productInBag.getText();
        Assert.assertEquals(expectedProduct, actualProduct);
    }
}
