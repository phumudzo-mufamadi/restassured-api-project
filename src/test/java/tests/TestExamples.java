package tests;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class TestExamples {

    public static void main(String[] args) {
        // Send GET request
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");

        // Print status code
        System.out.println("Status Code: " + response.getStatusCode());

        // Print response time in milliseconds
        System.out.println("Response Time: " + response.getTime() + " ms");

        // Optional: print response body
        System.out.println("Response Body: " + response.getBody().asString());
    }
    @Test
    public void test_2() {

        baseURI = "https://reqres.in/api";

        given()
                .when()
                .get("/users?page=2")
                .then()
                .statusCode(200)
                .body("data[1].id", equalTo(8));

    }


}


