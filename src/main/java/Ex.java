import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ex {
    public static void main(String[] args) {
        String key = "webdriver.chrome.driver";
        String path = "msedgedriver.exe";
        String url = "https://the-internet.herokuapp.com/nested_frames";
        System.setProperty(key, path);

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);
        driver.switchTo().frame(driver.findElement(By.name("frame-left")));
        String t = driver.findElement(By.xpath("//*[contains(text(), 'LEFT')]")).getText();
        System.out.println(t);
    }
}
