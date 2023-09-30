import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FrameDemo2 {
    public static void main(String[] args) {
        String key = "webdriver.chrome.driver";
        String path = "msedgedriver.exe";
        String url = "https://demoqa.com/nestedframes";
        System.setProperty(key, path);

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);
        WebElement f1 = driver.findElement(By.id("frame1"));
        driver.switchTo().frame(f1);
        WebElement f2 = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
        driver.switchTo().frame(f2);
        String textChild = driver.findElement(By.xpath("//*[contains(text(), 'Child Iframe')]")).getText();
        System.out.println(textChild);
        if (textChild.contains("Child Iframe")) System.out.println("My text case pass");
        else System.out.println("failed");
        driver.switchTo().defaultContent();
        String title = driver.getTitle();
        System.out.println(title);
        if (title.equals("DEMOQA")) System.out.println("test pass");
        else System.out.println("failed");

        driver.quit();


    }
}
