import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        LoginPage2 lp2 = new LoginPage2(driver);
        driver.get("https://www.saucedemo.com/");
        lp2.enterUsername("standard_user");
        lp2.enterPassword("secret_sauce");
        lp2.clickLoginIn();
        Thread.sleep(2000);
    }
}
