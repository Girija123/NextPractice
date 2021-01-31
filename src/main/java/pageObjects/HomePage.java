package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="")
    public WebElement searchTxtFld;

    @FindBy(xpath="")
    public  WebElement basketIcon;

    public void doSearch(String searchTerm)
    {
        searchTxtFld.sendKeys(searchTerm);
    }

    public void clickBagIcon()
    {
        basketIcon.click();
    }
}
