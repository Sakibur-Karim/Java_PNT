package final_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class two {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        WebElement r = driver.findElement(By.name("q"));
        r.sendKeys("java");
        Thread.sleep(500);
        driver.findElement(By.xpath("//ul[@role='listbox']//div[.='javascript']")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}