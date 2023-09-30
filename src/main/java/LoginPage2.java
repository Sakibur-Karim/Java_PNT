import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
    WebDriver driver;

    LoginPage2(WebDriver d) {
        driver = d;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="user-name")
    WebElement username;

    @FindBy(id="password")
    WebElement password;

    @FindBy(id="login-button")
    WebElement LogInButton;

    public void enterUsername(String uname) {
        username.sendKeys(uname);
    }
    public void enterPassword(String pwd) {
        username.sendKeys(pwd);
    }
    public void clickLoginIn() {
        LogInButton.click();
    }

}
