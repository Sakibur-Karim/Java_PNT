import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.Set;

public class TestNGEx1 {

    @BeforeMethod
    public void launchBrowser() {
        CommonUI.openBrowser("edge");
        String url = "https://jqueryui.com/droppable/#photo-manager";
        CommonUI.navigate(url);
    }

    @Test
    public void verifyTitle() throws InterruptedException {
        String title = CommonUI.getTitle();
        System.out.println(title);
        String exptdTitle = "Droppable | jQuery UI";
        Assert.assertEquals(title, exptdTitle);
        Thread.sleep(2000);
    }

    @Test
    public void getAlerts() throws InterruptedException {
        String url = "http://demo.automationtesting.in/Alerts.html";
        CommonUI.navigate(url);
        WebElement alertWithOK = CommonUI.driver.findElement(By.xpath("//a[contains(text(),'Alert with OK')]"));
        alertWithOK.click();
        Thread.sleep(3000);

        WebElement alertButton1 = CommonUI.driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]"));
        alertButton1.click();
        CommonUI.driver.switchTo().alert().accept();
        WebElement alertOKCancel = CommonUI.driver.findElement(By.xpath("//a[@href='#CancelTab']"));
        alertOKCancel.click();
        WebElement alertButton2 = CommonUI.driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
        alertButton2.click();
        CommonUI.driver.switchTo().alert().dismiss();
        Thread.sleep(2000);

        WebElement alertWithTextBox = CommonUI.driver.findElement(By.xpath("//a[@href='#Textbox']"));
        alertWithTextBox.click();

        WebElement alertButton3 = CommonUI.driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
        alertButton3.click();
        CommonUI.driver.switchTo().alert().sendKeys("Loser");
        CommonUI.driver.switchTo().alert().accept();
        Thread.sleep(2000);
    }

    @Test
    public void tooltipHandle() throws InterruptedException {
        CommonUI.navigate("https://www.facebook.com");
        WebElement actualToolTip = CommonUI.driver.findElement(By.xpath("//a[text()='Sign Up']"));
        Thread.sleep(2000);
        String expectedMssg = "Sign Up for Facebook";
        JavaScriptUtil.scrollIntoView(actualToolTip, CommonUI.driver);
        String toolTipMssg = actualToolTip.getAttribute("Title");
        Assert.assertEquals(expectedMssg, actualToolTip, "Tooltip Verified");
        Thread.sleep(2000);
    }

    @Test
    public void handleCookies() throws InterruptedException {
        CommonUI.navigate("https://www.facebook.com");
        Set<Cookie> cookiesList = CommonUI.driver.manage().getCookies();
        System.out.println(cookiesList.size());
        for (Cookie ck : cookiesList) {
            System.out.println(ck.getName() + ":" + ck.getValue());
        }
        Thread.sleep(2000);
    }

    @Test
    public void hardAssertMethod() {
        CommonUI.navigate("https://testautomationpractice.blogspot.com/");
        System.out.println("We are verifying title");
        String expectedTitle = "Automation Testing Practice";
        String actualTitle = CommonUI.driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle, "Title verified");
        System.out.println("Verifying Wikipedia Icon");
        WebElement wikiIcon = CommonUI.driver.findElement(By.className("wikipedia-search-wiki-link"));
        Assert.assertTrue(wikiIcon.isDisplayed());
    }

    @Test
    public void softAssertMethod() {
        SoftAssert softVerify = new SoftAssert();

        CommonUI.navigate("https://testautomationpractice.blogspot.com/");
        System.out.println("We are verifying title");
        String expectedTitle = "Automation Testing Practice";
        String actualTitle = CommonUI.driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle, "Title verified");
        System.out.println("Verifying Wikipedia Icon");
        WebElement wikiIcon = CommonUI.driver.findElement(By.className("wikipedia-search-wiki-link"));
        Assert.assertTrue(wikiIcon.isDisplayed());

        softVerify.assertAll();
    }

    @Test
    public void webTable() {
        CommonUI.driver.get("C:\\Users\\sakib\\Downloads\\Java_PNT\\sampleTable.html");
        String text = CommonUI.driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
        System.out.println(text);
        List<WebElement> rowList = CommonUI.driver.findElements(By.xpath("//table/tbody/tr"));
        System.out.println(rowList.size());
        List<WebElement> columnList = CommonUI.driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
        System.out.println(columnList.size());

        for (int r = 2; r < rowList.size(); r++) {
            for (int c = 1; c < columnList.size(); c++) {
                String data = CommonUI.driver.findElement(By.xpath("//table/tbody/tr[" + r + "]/td[" + c + "]")).getText();
                System.out.println(data);
            }
        }
    }

    @Test
    public void webTable_() {
        CommonUI.driver.get("https://testautomationpractice.blogspot.com/");
        List<WebElement> rowList = CommonUI.driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th"));
        System.out.println(rowList.size());
        List<WebElement> columnList = CommonUI.driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
        System.out.println(columnList.size());
        for (int r = 2; r <= rowList.size(); r++) {
            for (int c = 1; c <= columnList.size(); c++) {
                String data = CommonUI.driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[" + r + "]/td[" + c + "]")).getText();
                System.out.println(data);
            }
        }
    }

    @AfterMethod
    public void tearDown() {
        CommonUI.driver.quit();
    }
}