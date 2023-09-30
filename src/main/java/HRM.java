import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HRM {
    public static void main(String[] args) throws InterruptedException {
        String key = "webdriver.chrome.driver";
        String path = "msedgedriver.exe";
        // String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        System.setProperty(key, path);

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        // driver.get(url);

        ReadConfigFile ConfigFile = new ReadConfigFile();
        driver.get(ConfigFile.getUrl());

        Thread.sleep(3000);

        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys(ConfigFile.getUsername());

        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys(ConfigFile.getPassword());

        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
