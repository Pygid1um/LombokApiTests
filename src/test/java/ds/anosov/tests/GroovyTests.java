package ds.anosov.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static ds.anosov.specs.Specs.request;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;


public class GroovyTests {

    static String userEmail = "lindsay.ferguson@reqres.in";

    @DisplayName("Тест с использованием проверки на Groovy")
    @Test
    void testListUser(){
        given()
                .spec(request)
                .when()
                .get("/users?page=2")
                .then()
                .log().body()
                .body("data.findAll{it.email =~/.*?@reqres.in/}.email.flatten()",
                hasItem(userEmail));
    }

}
