package Lesson3;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.lessThan;

public class GET_TestHw3 extends AbstractTest {

    @Test
    void getMinProteinTest1() {
        JsonPath response = given()
                .queryParam("apiKey", getApiKey())
                .pathParam("id", 795751)
                .when()
                .get(getBaseUrl() + "recipes/{id}/information")
                .body()
                .jsonPath();
        assertThat(response.get("vegetarian"), is(false));
        assertThat(response.get("vegan"), is(false));
    }

    @Test
    void getSortTest2() {
        given()
                .queryParam("apiKey", getApiKey())
                .pathParam("id", 633841)
                .when()
                .get(getBaseUrl() + "recipes/{id}/information")
                .then()
                .assertThat()
                .statusCode(200)
                .statusLine("HTTP/1.1 200 OK")
                .statusLine(containsString("OK"));
    }

    @Test
    void getCuisineTest3() {
        given()
                .queryParam("apiKey", getApiKey())
                .response()
                .contentType(ContentType.JSON)
                .time(lessThan(2000L))
                .header("Connection", "keep-alive")
                .expect()
                .body("vegetarian", is(true))
                .body("vegan", is(false))
                .when()
                .get("https://api.spoonacular.com/recipes/643450/information");
    }

    @Test
    void getMaxSugarTest4() {
        JsonPath response  = given()
                .queryParam("apiKey", getApiKey())
                .pathParam("id", 716426)
                .when()
                .get(getBaseUrl() + "recipes/{id}/information")
                .body()
                .jsonPath();
        assertThat(response.get("sugar"), is(nullValue()));
        assertThat(response.get("vegan"), is(true));
        assertThat(response.get("caffeine"), is(nullValue()));
    }

    @Test
    void getMinVitaminATest5() {
        given()
                .queryParam("apiKey", getApiKey())
                .pathParam("id", 782601)
                .when()
                .get(getBaseUrl() + "recipes/{id}/information")
                .then()
                .assertThat()
                .statusCode(200)
                .statusLine("HTTP/1.1 200 OK")
                .statusLine(containsString("OK"));
    }
}
