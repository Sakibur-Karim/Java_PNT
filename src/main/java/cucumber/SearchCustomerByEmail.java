package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchCustomerByEmail {
    WebDriver ldriver;
    public SearchCustomerByEmail (WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//input[@id='SearchEmail']")
    WebElement emailTextBox;

    @FindBy(xpath = "//button[@id='search-customers']")
    WebElement searchButton;

    @FindBy(xpath = "//table[@class='table table-bordered table-hover table-striped dataTable no-footer']")
    WebElement searchResult;

    @FindBy(xpath = "//table[@class='table table-bordered table-hover table-striped dataTable no-footer']/tbody/tr")
    List <WebElement> tableRows;

    @FindBy(xpath = "//table[@class='table table-bordered table-hover table-striped dataTable no-footer']/tbody/tr[1]/td[2]")
    List <WebElement> tableColumns;

    //Action method to search email

    public void enterEmail(String emailID) {
        emailTextBox.sendKeys(emailID);
    }
    public void clickOnSearchButton() {
        searchButton.click();
    }
    public boolean searchCustomerByEmail(String email) throws InterruptedException {
        boolean found = false;
        int totalRows = tableRows.size();
        System.out.println(totalRows);

        int totalCol = tableColumns.size();
        System.out.println(totalCol);

        for (int i = 1; i <= totalRows; i++) {

            Thread.sleep(2000);
            WebElement webemail = ldriver.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr[" + i + "]/td[2]"));

            String ActualEmail = webemail.getText();

            if (ActualEmail.equals(email)) {
                found = true;
                break;
            }

        }
        return found;
    }

}
