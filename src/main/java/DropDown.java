import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;

public class DropDown {
    public static void main(String[] args) throws InterruptedException, IOException {
        String key = "webdriver.chrome.driver";
        String path = "msedgedriver.exe";
        String url = "https://www.letskodeit.com/practice";
        System.setProperty(key, path);

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);
        WebElement sCars = driver.findElement(By.id("carselect"));


        Select select = new Select(sCars);
        System.out.println(select.isMultiple());
        select.selectByValue("bmw");
        Thread.sleep(200);
        select.selectByVisibleText("BMW");
        Thread.sleep(200);
        select.selectByIndex(2);
        Thread.sleep(200);
        List<WebElement> carList = select.getOptions();
        System.out.println(carList.size());
        for (WebElement car : carList
        ) {
            String text = car.getText();
            if (text.equals("Benz")) car.click();
        }

        Thread.sleep(1000);
        driver.quit();

    }
}