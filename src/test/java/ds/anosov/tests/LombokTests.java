package ds.anosov.tests;

import ds.anosov.models.UserLombok;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static ds.anosov.specs.Specs.request;
import static ds.anosov.specs.Specs.responseSpec;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class LombokTests {
    
    static String UserEmail = "janet.weaver@reqres.in",
                    UserFirstName = "Janet",
                    UserLastName = "Weaver";

    @DisplayName("API тест с использованием моделей и библиотеки Lombok")
    @Test
    void testUser(){
        UserLombok data = given()
                .spec(request)
                .when()
                    .get("/users/2")
                .then()
                    .spec(responseSpec)
                    .log().body()
                    .extract().as(UserLombok.class);


        assertEquals(2, data.getUser().getId());
        assertEquals(UserEmail, data.getUser().getEmail());
        assertEquals(UserFirstName, data.getUser().getFirstName() );
        assertEquals(UserLastName, data.getUser().getLastName());

    }

}
