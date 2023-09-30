package cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerPage {
    WebDriver ldriver;
    public AddNewCustomerPage (WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
	@FindBy(xpath="//a[@href='#']//p[contains(text(),'Customers')]")
	WebElement LinkCustomers_menu;

	@FindBy(xpath="//a[@href=\"/Admin/Customer/List\"]")
	WebElement LinkCustomers_menuItems;

	@FindBy(xpath="//a[@class='btn btn-primary']")
	WebElement AddNewBttn;

	@FindBy(xpath="//input[@id='Email']")
	WebElement emailbtn;

	@FindBy(xpath="//input[@id='Password']")
	WebElement passbtn;

	@FindBy(xpath="//input[@id='FirstName']")
	WebElement firstname;

	@FindBy(xpath="//input[@id='LastName']")
	WebElement lastname;

	@FindBy(xpath="//input[@id='Gender_Male']")
	WebElement Malebtn;

	@FindBy(xpath="//input[@id='Gender_Female']")
	WebElement Femalebtn;

	@FindBy(xpath="//input[@id='DateOfBirth']")
	WebElement dobbtn;

	@FindBy(xpath="//input[@id='Company']")
	WebElement companybtn;

	@FindBy(xpath="//div[@class='k-multiselect-wrap k-floatwrap']")
	WebElement CRolebtn;

	@FindBy(xpath="//button[@name='save']")
	WebElement savebtn;

	public String getPageTitle() {
		return ldriver.getTitle();
	}

	public void clickOnCustomerMenu() {
		LinkCustomers_menu.click();
	}

	public void clickOnCustomerMenuItem() {
		LinkCustomers_menuItems.click();
	}

	public void clickOnAddNew() {
		AddNewBttn.click();
	}

	public void enterEmail(String email) {
		emailbtn.sendKeys(email);
	}

	public void enterPassword(String password) {
		passbtn.sendKeys(password);
	}
	public void enterFirstName(String fname) {
		firstname.sendKeys(fname);
	}
	public void enterLastName(String lname) {
		lastname.sendKeys(lname);
	}
	public void enterDOB(String dob) {
		dobbtn.sendKeys(dob);
	}

	public void enterGender(String gender) {
		if (gender.equals("Male")) Malebtn.click();
		else Malebtn.click();
	}
	public void enterCompanyName(String compamy) {
		companybtn.sendKeys(compamy);
	}

	public void enterSave() {
		savebtn.click();
	}
}
