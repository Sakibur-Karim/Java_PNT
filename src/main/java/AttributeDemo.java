import org.testng.annotations.*;

public class AttributeDemo {
    @BeforeSuite
    public void beforeSuit() {
        System.out.println("before");
    }

    @AfterSuite
    public void afterSuit() {
        System.out.println("after");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("before test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("after test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("before class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("after class");
    }


    @BeforeMethod
    public void beforeMethod() {
        System.out.println("before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("after method");
    }

    @Test
    public void testCase1() {
        System.out.println("test case 1");
    }

    @Test
    public void testCase2() {
        System.out.println("test case 2");
    }
}
