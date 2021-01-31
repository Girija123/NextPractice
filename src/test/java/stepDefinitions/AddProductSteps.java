package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pageObjects.BasketPage;
import pageObjects.HomePage;
import pageObjects.PDPage;
import pageObjects.PLPage;
import utils.CommonFunctions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class AddProductSteps extends CommonFunctions {

    HomePage homePage = new HomePage(driver);
    PLPage plPage = new PLPage(driver);
    PDPage pdPage = new PDPage(driver);
    BasketPage basketPage = new BasketPage(driver);

    @Given("^I'm on Home Page \"([^\"]*)\"$")
    public void i_m_on_Home_Page(String url) throws Throwable {
        driver.get(url);
    }

    @When("^I search for a product \"([^\"]*)\"$")
    public void i_search_for_a_product(String searchTerm) throws Throwable {
        homePage.doSearch(searchTerm);
        keyEnter();
    }

    @When("^I choose the product \"([^\"]*)\"$")
    public void i_choose_the_product(String productName) throws Throwable {
        plPage.chooseProduct(productName);
        waitForTime(2);
    }

    @When("^I select the size \"([^\"]*)\"$")
    public void i_select_the_size(String size) throws Throwable {
        pdPage.selectSize();
    }

    @When("^I click Add to Bag button$")
    public void i_click_Add_to_Bag_button() throws Throwable {
        pdPage.clickAddToBagBtn();
    }

    @Then("^I should see the appropriate product in the bag\"([^\"]*)\"$")
    public void i_should_see_the_appropriate_product_in_the_bag(String expectedProductInBag) throws Throwable {
        homePage.clickBagIcon();
        basketPage.validateProductInBag(expectedProductInBag);

    }

}
