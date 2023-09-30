import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class AmazonIDDemo {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.edge.driver", "msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //Launch the Site.
        driver.get("https://www.twoplugs.com/");
//        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java Book");
//        driver.findElement(By.id("nav-search-submit-button")).click();

//        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
//        searchBox.sendKeys("Java Book");
        WebElement loginButton = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/ul[1]/li[1]/a[1]/span[1]"));
        loginButton.click();
        File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Files.copy(f.toPath(), new File("C:\\Users\\sakib\\Downloads\\1.jpg").toPath());
        System.out.println(driver.getTitle());
        Thread.sleep(6000);

        //Close the browser
        driver.quit();
    }
}
