import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class CommonUI {
    public static WebDriver driver;

    // This method takes 1 String param and opens the browser
    public static void openBrowser(String browser) {
        try {
            switch (browser.toLowerCase()) {
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

            }
        } catch (Exception e) {
            System.out.println("Browser has[" + browser + "]value. Make sure to pass[chrome,edge/firefox]");
            e.printStackTrace();
        }
    }

    public static void openBrowser2(String browser) {
        String key = null;
        String path = null;
        try {
            switch (browser.toLowerCase()) {
                case "firefox":
                    key = "webdriver.chrome.driver";
                    path = "msedgedriver.exe";
                    System.setProperty(key, path);
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    key = "webdriver.edge.driver";
                    path = "msedgedriver.exe";
                    System.setProperty(key, path);
                    driver = new EdgeDriver();
                    break;
                case "chrome":
                    key = "webdriver.chrome.driver";
                    path = "msedgedriver.exe";
                    System.setProperty(key, path);
                    driver = new ChromeDriver();
                    break;

            }
        } catch (Exception e) {
            System.out.println("Browser has[" + browser + "]value. Make sure to pass[chrome,edge/firefox]");
            e.printStackTrace();
        }
    }

    /*
     * This method takes 1 String param and maximize the window, sets implicitly
     * wait, naviagtes to the page
     */
    public static void navigate(String url) {
        try {
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get(url);

        } catch (Exception e) {
            System.out.println("Check the url[" + url + "], make sure it has proper format");
            e.printStackTrace();

        }

    }

    // This method return title of the page
    public static String getTitle() {
        try {

            return driver.getTitle();
        } catch (Exception e) {
            System.out.println("Driver instance is null");
            e.printStackTrace();
            return null;
        }
    }

    // isDisplayed()- takes 1 param WebElement and check if ele is displayed
    public static boolean isDisplayed(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            System.out.println("Element not exists:" + element);
            e.printStackTrace();
            return false;
        }
    }

    // isSelected()- takes 1 param WebElement and check if ele is displayed
    public static boolean isSelected(WebElement element) {
        try {
            return element.isSelected();
        } catch (Exception e) {
            System.out.println("Element not selected:" + element);
            e.printStackTrace();
            return false;
        }
    }

    // isEnabled()- takes 1 param WebElement and check if ele is displayed
    public static boolean isEnabled(WebElement element) {
        try {
            return element.isEnabled();
        } catch (Exception e) {
            System.out.println("Element not enabled:" + element);
            e.printStackTrace();
            return false;
        }
    }

    // click()- takes 1 param WebElement and check if ele is displayed
    // then perform click action if it displayed
    public static void click(WebElement element) {
        if (isDisplayed(element)) {
            element.click();
        }
    }

    // click()- takes 2 param WebElement & 1 boolean selected and check if ele is selected
    // then perform click action if it displayed
    public static void click(WebElement element, boolean isCheckBoxSelected) {
        if (!isCheckBoxSelected) {
            element.click();
        }
    }

    // getText()- takes 1 param and return the text displayed on ui
    public static String getText(WebElement element) {
        String text = null;
        if (isDisplayed(element)) {
            text = element.getText();
        }
        return text;
    }

    // enter()- takes 2 params, it clear the value and then enters the new text
    public static void enter(WebElement element, String value) {
        if (isDisplayed(element)) {
            element.clear();
            element.sendKeys(value);
        }
    }

}
//navigate to the url ( maxmizie, implicit wait...

// click method

// is display method

// is enabled

// is Selectected

// handle dropdown

// getTitle

// getText

// entervalue