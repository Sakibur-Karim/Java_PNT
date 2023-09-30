import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class Ex1 {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.edge.driver", "msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        //Maximize window
        driver.manage().window();

        //Launch the Site.
        driver.get("https://demo.automationtesting.in/Index.html");
        driver.findElement(By.id("btn2")).click();
        Thread.sleep(3000);
        if (driver.getTitle().equals("Register")) System.out.println("Passed");

        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Sakibur");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Karim");
        driver.findElement(By.xpath("//textarea")).sendKeys("56 Wood Lake");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("fqpumphrey16@yopmail.com");
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1234567890");
        driver.findElement(By.xpath("//input[@value='Male']")).click();
        driver.findElement(By.xpath("//input[@value='Cricket']")).click();


        Select skills = new Select(driver.findElement(By.id("Skills")));
        skills.selectByVisibleText("Java");

        Select country = new Select(driver.findElement(By.id("country")));
        country.selectByVisibleText("United States of America");

        Select year = new Select(driver.findElement(By.id("yearbox")));
        year.selectByVisibleText("2000");
        Select month = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
        month.selectByVisibleText("January");
        Select day = new Select(driver.findElement(By.id("daybox")));
        day.selectByVisibleText("1");
        driver.findElement(By.id("firstpassword")).sendKeys("12345678");
        driver.findElement(By.id("secondpassword")).sendKeys("12345678");
        driver.findElement(By.id("submitbtn")).click();

        Thread.sleep(3000);
        driver.quit();
    }
}
