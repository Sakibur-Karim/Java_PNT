package cucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class StepDefinitionClass extends BaseClass {

    @Before
    public void setup() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    @Given("User Launch Chrome browser")
    public void user_launch_chrome_browser() {
        //Allocating memory to LoginPage
        lp = new LoginPage(driver);
        //Allocating memory to AddNewCustomerPage
        ancp = new AddNewCustomerPage(driver);
        scbe = new SearchCustomerByEmail(driver);
    }

    @When("User opens URL {string}")
    public void user_opens_url(String url) {
        driver.get(url);

    }

    @When("User enters Email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String emailAdd, String passwordAdd) {
        lp.enterEmail(emailAdd);
        lp.enterPassword(passwordAdd);
    }

    @When("click on Login")
    public void click_on_login() {
        lp.clickLogin();

    }

    @Then("Page Title should be {string}")
    public void page_title_should_be(String expectedTitle) {
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        if (actualTitle.equals(expectedTitle)) Assert.assertTrue(true);
        else Assert.fail();
    }

    @When("User click on Log out link")
    public void user_click_on_log_out_link() {
        lp.clickLogout();

    }

    @Then("close browser")
    public void close_browser() {
        driver.close();
        driver.quit();
    }

    //Add New Customer
    @Then("User can view Dashboard")
    public void user_can_view_dashboard() {
        String actualTitle = ancp.getPageTitle();
        String expectedTitle = "Dashboard / nopCommerce administration";
        Assert.assertEquals(actualTitle, expectedTitle);

    }

    @When("User click on customers menu")
    public void user_click_on_customers_menu() {
        ancp.clickOnCustomerMenu();

    }

    @When("click on customers Menu Item")
    public void click_on_customers_menu_item() {
        ancp.clickOnCustomerMenuItem();

    }

    @When("click on Add new button")
    public void click_on_add_new_button() {
        ancp.clickOnAddNew();

    }

    @Then("User can view and Add new customer page")
    public void user_can_view_and_add_new_customer_page() {
        //This is the verification, verify new page
        String actualTitle = ancp.getPageTitle();
        String expectedTitle = "Add a new customer / nopCommerce administration";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @When("User enter customer info")
    public void user_enter_customer_info() throws InterruptedException {
        Thread.sleep(3000);
        ancp.enterEmail(generateEmailID() + "@gmail.com");
        ancp.enterPassword("Test123");
        ancp.enterFirstName("P");
        ancp.enterLastName("NT");
        ancp.enterDOB("1/1/2050");
        ancp.enterCompanyName("PNT");
        ancp.enterGender("Male");
    }

    @When("click on Save button")
    public void click_on_save_button() {
        ancp.enterSave();

    }

    @Then("User can view confirmation message {string}")
    public void user_can_view_confirmation_message(String expectedConfirmMessage) {
        String text = driver.findElement(By.tagName("Body")).getText();
        if (text.contains(expectedConfirmMessage)) Assert.assertTrue(true);
        else Assert.fail();
    }

    @When("Enter customer Email")
    public void enter_customer_email() {
        scbe.enterEmail(" ");
    }

    @When("click on search button")
    public void click_on_search_button() {
        scbe.clickOnSearchButton();

    }

    @Then("User should found Email in the search table")
    public void user_should_found_email_in_the_search_table() throws InterruptedException {
        String expectedEmail = " ";
        Assert.assertTrue(scbe.searchCustomerByEmail(expectedEmail));
    }

    @After
    public void tearDown(Scenario sc) throws IOException {
        if (sc.isFailed()) {
            File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            Files.copy(f.toPath(), new File ("C:/Users/sakib/Downloads/Java_PNT/Screenshot/Failed.jpg").toPath());
        }
        System.out.println("Teardown executed");
        driver.quit();
    }

}
