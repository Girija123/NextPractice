package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PDPage {

    public PDPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="")
    public WebElement sizeSlct;

    @FindBy(xpath="")
    public WebElement sizeValue;

    @FindBy(xpath="")
    public WebElement addToBagBtn;

    public void selectSize()
    {
        sizeSlct.click();
        sizeValue.click();
    }

    public void clickAddToBagBtn()
    {
        addToBagBtn.click();
    }


}
