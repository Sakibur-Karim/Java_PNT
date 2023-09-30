import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FrameDemo {
    public static void main(String[] args) {
        String key = "webdriver.chrome.driver";
        String path = "msedgedriver.exe";
        String url = "http://www.rediff.com/";
        System.setProperty(key, path);

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);
        driver.switchTo().frame("moneyiframe");
        String textNSE = driver.findElement(By.cssSelector("span#nseindex")).getText();
        System.out.println(textNSE);
    }
}
