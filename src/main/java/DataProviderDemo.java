import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;

public class DataProviderDemo {

//    @DataProvider(name = "searchDataSet")
    public Object [][] searchData() {
        Object [][] searchKeywords = new Object[3][2];
        searchKeywords[0][0] = "USA";
        searchKeywords[0][1] = "Thousand Islands";
        searchKeywords[1][0] = "New York";
        searchKeywords[1][1] = "Niagara Falls";
        searchKeywords[2][0] = "Ohio";
        searchKeywords[2][1] = "Chicago";
        return searchKeywords;
    }

//    @Test(name = "searchDataSet")
    public void googleSearch(String country, String monument) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        WebElement sBox = driver.findElement(By.name("q"));
        sBox.sendKeys(country + " " + monument);
        WebElement sBoxBtn = driver.findElement(By.name("btnK"));
        sBoxBtn.click();
        Thread.sleep(2000);
        driver.quit();
    }

}
