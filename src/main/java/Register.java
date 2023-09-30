import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class Register {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.edge.driver", "msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //Launch the Site.
        driver.get("https://demo.guru99.com/test/newtours/");
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]")).click();
        driver.findElement(By.name("firstName")).sendKeys("Sergio");
        driver.findElement(By.name("lastName")).sendKeys("Pumphrey");
        driver.findElement(By.name("phone")).sendKeys("1411986752");
        driver.findElement(By.name("userName")).sendKeys("fqpumphrey16@yopmail.com");

        driver.findElement(By.name("address1")).sendKeys("56 Wood Lake");
        driver.findElement(By.name("city")).sendKeys("Wood Lake");
        driver.findElement(By.name("state")).sendKeys("North Carolina");
        driver.findElement(By.name("postalCode")).sendKeys("28652");

        Select drpCountry = new Select(driver.findElement(By.name("country")));
        drpCountry.selectByVisibleText("ANTARCTICA");

        driver.findElement(By.name("email")).sendKeys("fqpumphrey16@yopmail.com");
        driver.findElement(By.name("password")).sendKeys("12345678");
        driver.findElement(By.name("confirmPassword")).sendKeys("12345678");

        driver.findElement(By.name("submit")).click();

        System.out.println(driver.getTitle());
        Thread.sleep(6000);

        driver.quit();
    }
}
