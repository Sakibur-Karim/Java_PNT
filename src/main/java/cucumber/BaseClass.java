package cucumber;

import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class BaseClass {
    public WebDriver driver;
    public LoginPage lp;
    public AddNewCustomerPage ancp;
    public SearchCustomerByEmail scbe;

    public String generateEmailID() {
        return (RandomStringUtils.randomAlphabetic(5));
    }
}
