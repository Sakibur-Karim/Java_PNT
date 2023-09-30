import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage1 {
    WebDriver driver;

    LoginPage1(WebDriver d) {
        driver = d;
    }

    By username = By.id("user-name");
    By password = By.id("password");
    By loginButton = By.id("login-button");

    public void enterUser (String uname) {
        driver.findElement(username).sendKeys(uname);
    }
    public void enterPassword (String pwd) {
        driver.findElement(password).sendKeys(pwd);
    }
    public void clickLogInBtn() {
        driver.findElement(loginButton).click();
    }
}
