import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoAutomation {
    public static void main(String[] args) throws InterruptedException {
        String key = "webdriver.chrome.driver";
        String path = "msedgedriver.exe";
        String url = "https://demo.automationtesting.in/Index.html";
        System.setProperty(key, path);

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);
        // //a[@href='Register.html']//following::button
        driver.findElement(By.xpath("//a[@href='Register.html']//following::button")).click();
        String title = driver.getTitle();
        if (title.equals("Register")) System.out.println("Passed");
        else System.out.println("Failed");
        WebElement firstName = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
        firstName.sendKeys("aura");

        WebElement lastName = driver.findElement(By.cssSelector("input[placeholder^='La']"));
        lastName.sendKeys("sphere");

        driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("37-13 gcp");

        driver.findElement(By.cssSelector("input[ng-model*='EmailAdress']")).sendKeys("sadada@piit.us");

        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1234567890");

        driver.findElement(By.xpath("//input[@value='Male']")).click();

        WebElement hobbies = driver.findElement(By.cssSelector("#checkbox1"));
        hobbies.click();

        Select country = new Select(driver.findElement(By.id("country")));
        country.selectByVisibleText("United States of America");


        Thread.sleep(3000);
        driver.quit();
    }
}