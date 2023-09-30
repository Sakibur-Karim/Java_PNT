import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionClassExample1 {
    WebDriver driver;

    @Before
    public void setup() {
        String key = "webdriver.chrome.driver";
        String path = "msedgedriver.exe";
        String url = "https://demoqa.com/buttons";
        System.setProperty(key, path);

        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);
    }

    @Test
    public void testCase1() {
        Actions actions = new Actions(driver);
        WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
        actions.doubleClick(doubleClickBtn).build().perform();
        String dcMessage = driver.findElement(By.id("doubleClickMessage")).getText();
        if (dcMessage.contains("double click")) System.out.println("pass");
        else System.out.println("fail");
    }

    @Test
    public void testCase2() {
        Actions actions = new Actions(driver);
        WebElement doubleClickBtn = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(doubleClickBtn).build().perform();
        String dcMessage = driver.findElement(By.id("rightClickMessage")).getText();
        if (dcMessage.contains("right click")) System.out.println("pass");
        else System.out.println("fail");
    }


    @Test
    public void testCase3() {
        Actions actions = new Actions(driver);
        WebElement doubleClickBtn = driver.findElement(By.xpath("//*[text()='Click Me']"));
        actions.click(doubleClickBtn).build().perform();
        String dcMessage = driver.findElement(By.id("dynamicClickMessage")).getText();
        if (dcMessage.contains("dynamic click")) System.out.println("pass");
        else System.out.println("fail");
    }

    @Test
    public void testCase4() throws InterruptedException {
        String url2 = "https://jqueryui.com/droppable/#photo-manager";
        driver.get(url2);
        driver.switchTo().frame(0);
        Actions actions = new Actions(driver);
        WebElement p1 = driver.findElement(By.xpath("//*[@id='gallery']/li[1]"));
        WebElement p2 = driver.findElement(By.xpath("//*[@id='gallery']/li[2]"));
        WebElement p3 = driver.findElement(By.xpath("//*[@id='gallery']/li[3]"));
        WebElement p4 = driver.findElement(By.xpath("//*[@id='gallery']/li[4]"));
        WebElement target = driver.findElement(By.cssSelector("div#trash"));
        actions.clickAndHold(p1).moveToElement(target).release().build().perform();
        Thread.sleep(2000);
        actions.clickAndHold(p2).moveToElement(target).release().build().perform();
        Thread.sleep(2000);
        actions.clickAndHold(p3).moveToElement(target).release().build().perform();
        Thread.sleep(2000);
        actions.clickAndHold(p4).moveToElement(target).release().build().perform();
        Thread.sleep(2000);
        System.out.println("click and hold done");
    }

    @Test
    public void testCase5() {
        String url3 = "https://demo.automationtesting.in/Register.html";
        driver.get(url3);
        WebElement switchToTab = driver.findElement(By.xpath("//a[contains(text(), 'SwitchTo')]"));
        WebElement alerts = driver.findElement(By.xpath("//a[contains(text(), 'Alert')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(switchToTab).moveToElement(alerts).click().build().perform();
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}

