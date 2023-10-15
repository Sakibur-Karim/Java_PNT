import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class Test01_GET {
    @Test
    void test_01() {
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println(response.body());
        System.out.println(response.getStatusCode());
        System.out.println(response.getHeader("content-type"));
        System.out.println(response.getTime());
    }
}
