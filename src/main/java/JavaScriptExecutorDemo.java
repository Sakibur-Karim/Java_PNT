import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScriptExecutorDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.twoplugs.com/");
        Thread.sleep(2000);
        WebElement joinFree = driver.findElement(By.xpath("//span[text()='Join now for free']//ancestor::a[1]"));
//        JavaScriptUtil.flash(joinFree, driver);

//        JavaScriptUtil.drawBorder(joinFree, driver);
        String title = JavaScriptUtil.getTitleByJS(driver);
        System.out.println(title);
        WebElement login = driver.findElement(By.xpath("//span[text()='LOG in']"));
//JavaScriptUtil.clickElementByJS(login,driver);
//JavaScriptUtil.generateAlert(driver, "defrgehtrg");
//JavaScriptUtil.refreshBrowserByJS(driver);
//Thread.sleep(2000);
        WebElement image = driver.findElement(By.xpath("//*[@src='/newlayout/images/screen.png']"));
        JavaScriptUtil.scrollIntoView(image, driver);
//        driver.quit();
    }
}
