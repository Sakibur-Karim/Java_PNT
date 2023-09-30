import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;

public class CheckBox {
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
        WebElement bmwCheckButton = driver.findElement(By.id("bmwcheck"));
        WebElement benzCheckButton = driver.findElement(By.id("benzcheck"));
        WebElement hondaCheckButton = driver.findElement(By.id("hondacheck"));


        //Launch the Site.

        boolean bmwSelected = bmwCheckButton.isSelected();
        boolean bmwEnabled = bmwCheckButton.isEnabled();
        boolean bmwDisplayed = bmwCheckButton.isDisplayed();
        System.out.println(bmwDisplayed + " " + bmwSelected + " " + bmwEnabled);

        boolean hondaSelected = hondaCheckButton.isSelected();
        if (hondaSelected) {
            WebElement nameField = driver.findElement(By.id("name"));
            nameField.sendKeys("Loser");
        } else {
            driver.findElement(By.id("benzradio")).click();
        }


        boolean hondaEnabled = hondaCheckButton.isEnabled();
        boolean hondaDisplayed = hondaCheckButton.isDisplayed();
        System.out.println(hondaDisplayed + " " + hondaSelected + " " + hondaEnabled);


        Thread.sleep(6000);
        driver.quit();
    }
}
