import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;

public class SignOn {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.edge.driver", "msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //Launch the Site.
        driver.get("https://demo.guru99.com/test/newtours/");
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]")).click();
        driver.findElement(By.name("userName")).sendKeys("Sakib");
        driver.findElement(By.name("password")).sendKeys("12345678");
        driver.findElement(By.name("submit")).click();

        System.out.println(driver.getTitle());
        Thread.sleep(6000);

        //Close the browser
        driver.quit();
    }
}
