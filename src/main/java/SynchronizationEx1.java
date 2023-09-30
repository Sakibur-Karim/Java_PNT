import com.google.common.base.Stopwatch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SynchronizationEx1 {
    public static void main(String[] args) {
        String key = "webdriver.chrome.driver";
        String path = "msedgedriver.exe";
        String url = "http://www.ebay.in/";
        System.setProperty(key, path);

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.linkText("START2 SELLING")).click();
        Stopwatch watch = null;
        try {
            watch = Stopwatch.createStarted();
            driver.findElement(By.linkText("START2 SELLING")).click();
        } catch (Exception e) {
            watch.stop();
            System.out.println(watch.elapsed(TimeUnit.SECONDS));
            System.out.println(e);
        }
    }
}
