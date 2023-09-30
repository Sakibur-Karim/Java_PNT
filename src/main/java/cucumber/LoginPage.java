package cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//interview: what is pageobject model and have you ever used it before?
public class LoginPage {
    WebDriver ldriver;
    LoginPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(id="Email")
    WebElement email;

    @FindBy(id="Password")
    WebElement password;

    @FindBy(xpath = "//button[@class='button-1 login-button']\n" +
            "\n")
    WebElement loginButton;

    @FindBy(xpath = "//a[text()='Logout']")
    WebElement logoutButton;

    public void enterEmail(String emailId) {
        email.clear();
        email.sendKeys(emailId);
        // email.sendKeys("admin@yourstore.com");
    }

    public void enterPassword(String pwd) {
        password.clear();
        password.sendKeys(pwd);
        // password.sendKeys("admin");
    }

    public void clickLogin() {
        loginButton.click();
    }

    public void clickLogout() {
        logoutButton.click();
    }
}
