package step_definitions;

import Pages.BasePage;
import Pages.ContactUsPage;
import Pages.DashboardPage;
import Utilities.BrowserUtils;
import Utilities.ConfigurationReader;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;


public class ContactUs {

    DashboardPage dashboardPage = new DashboardPage();
    ContactUsPage contactUsPage = new ContactUsPage();

    @Given("the user is on the main page")
    public void the_user_is_on_the_main_page() {

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        BrowserUtils.waitFor(3);
        dashboardPage.AcceptCookies.click();
    }


    @When("the user navigates to {string}")
    public void the_user_navigates_to(String string) {
        BrowserUtils.waitForClickablility(dashboardPage.ContactUs, 5);
        dashboardPage.ContactUs.click();
        BrowserUtils.waitFor(2);

    }

    @Then("the user should see the page title as {string}")
    public void the_user_should_see_the_page_title_as(String ExpectedTitle) {

        String actualPageTitle = Driver.get().getTitle();
        Assert.assertEquals(ExpectedTitle, actualPageTitle);


    }

    @Given("user is on the contact us page")
    public void user_is_on_the_contact_us_page() {

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        BrowserUtils.waitFor(3);
        dashboardPage.AcceptCookies.click();
        dashboardPage.ContactUs.click();
        BrowserUtils.waitFor(2);
    }

    @When("user should be scroll down and reach the end of the page.")
    public void user_should_be_scroll_down_and_reach_the_end_of_the_page() {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("window.scrollBy(0,750)");
        BrowserUtils.waitFor(3);

    }

    @Then("user should see the addres line as {string}")
    public void user_should_see_the_addres_line_as(String Addres) {
        String actualaddres=contactUsPage.address.getText();
        Assert.assertEquals(Addres,actualaddres);
    }

}