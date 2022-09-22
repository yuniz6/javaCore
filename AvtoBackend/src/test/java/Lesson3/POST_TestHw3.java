package Lesson3;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class POST_TestHw3 extends AbstractTest {

    @Test
    void postBurgerTest1() {
        given()
                .queryParam("apiKey", getApiKey())
                .contentType("application/x-www-form-urlencoded")
                .formParam("title", "burger")
                .when()
                .post(getBaseUrl() + "recipes/cuisine")
                .then()
                .statusCode(200);
    }

    @Test
    void postAmericanTest2() {
        Response response = given()
                .queryParam("apiKey", getApiKey())
                .contentType("application/x-www-form-urlencoded")
                .formParam("title", "American")
                .when()
                .post(getBaseUrl() + "recipes/cuisine")
                .then().extract().response();
    }

    @Test
    void postChickenTest3() {
        String confidence = given()
                .queryParam("apiKey", getApiKey())
                .contentType("application/x-www-form-urlencoded")
                .formParam("title", "Chicken")
                .when()
                .post(getBaseUrl() + "recipes/cuisine")
                .then().extract()
                .jsonPath()
                .get("confidence")
                .toString();

        System.out.println("confidence: " + confidence);
    }

    @Test
    void postGermanTest4() {
        String confidence = given()
                .queryParam("apiKey", getApiKey())
                .contentType("application/x-www-form-urlencoded")
                .formParam("title", "German")
                .when()
                .post(getBaseUrl() + "recipes/cuisine")
                .then().extract()
                .jsonPath()
                .get("confidence")
                .toString();

        System.out.println("confidence: " + confidence);
    }

    @Test
    void postItalianTest5() {
        String confidence = given()
                .queryParam("apiKey", getApiKey())
                .contentType("application/x-www-form-urlencoded")
                .formParam("title", "Italian")
                .when()
                .post(getBaseUrl() + "recipes/cuisine")
                .then().extract()
                .jsonPath()
                .get("confidence")
                .toString();

        System.out.println("confidence: " + confidence);
    }
}
