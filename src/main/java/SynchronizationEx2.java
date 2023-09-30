import com.google.common.base.Stopwatch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SynchronizationEx2 {
    public static void main(String[] args) throws InterruptedException {
        String key = "webdriver.chrome.driver";
        String path = "msedgedriver.exe";
        String url = "http://www.ebay.in/";
        System.setProperty(key, path);

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Stopwatch watch = null;
        try {
            watch = Stopwatch.createStarted();
            WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("START SELLING")));
            ele.click();

        } catch (Exception e) {
            System.out.println(e);
        }

        watch.stop();
        System.out.println(watch.elapsed(TimeUnit.SECONDS) + " seconds");

        Thread.sleep(2000);
        driver.quit();
    }
}
