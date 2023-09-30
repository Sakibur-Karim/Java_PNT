import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;

public class RadioButtons {
    public static void main(String[] args) throws InterruptedException, IOException {
        String key = "webdriver.chrome.driver";
        String path = "msedgedriver.exe";
        String url = "https://www.letskodeit.com/practice";

        System.setProperty(key, path);

        WebDriver driver = new EdgeDriver();

        //Maximize window
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);
        WebElement bmwRadioButton = driver.findElement(By.id("bmwradio"));
        WebElement benzRadioButton = driver.findElement(By.id("benzradio"));
        WebElement hondaRadioButton = driver.findElement(By.id("hondaradio"));

        bmwRadioButton.click();
        Thread.sleep(2000);
        benzRadioButton.click();
        Thread.sleep(2000);
        hondaRadioButton.click();

        driver.quit();
    }
}