import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NewToursDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //Launch the Site.
        driver.get("https://demo.guru99.com/test/newtours/");
        driver.findElement(By.name("userName")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("12345678");
        driver.findElement(By.name("submit")).click();

        Thread.sleep(3000);

        //Close the browser
        driver.quit();
    }

}
