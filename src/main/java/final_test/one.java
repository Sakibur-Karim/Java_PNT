package final_test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

public class one {

    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/";

        RequestSpecification request = RestAssured.given();

        String requestBody = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";

        Response response = request
                .header("Content-Type", "application/json") // Set the content type if necessary
                .body(requestBody)
                .post("/api/users");

        int statusCode = response.getStatusCode();
        System.out.println("Response Status Code: " + statusCode);

        Assert.assertEquals(statusCode, 201, "Status code is not as expected");
    }
}
