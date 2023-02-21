package Pet_Smart_Tests;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;


import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class PostPetSmart {
    @Test(priority=0)
    public void add_pet(){
        // Json Body to pass in the reques
        String jsonBody = "{" +
                "   \"id\":\"20\",\n" +
                "   \"name\":\"Happy\",\n" +
                "   \"status\":\"Pending\"\n" +
                "}";

        given()
                .header("api_key", "special-key")
                   .accept(ContentType.JSON)
                    .contentType(ContentType.JSON)
                    .and()
                    .body(jsonBody)
                .when()
                    .post("https://petstore.swagger.io/v2/pet")
                .then()
                    .log().all()
                    .statusCode(200)
                    .body("name", equalTo("Happy"))
                    .assertThat().header("Content-Type", "application/json");

    }
    @Test(priority=0)
    public void update_pet_formdata(){
                // Json Body to pass in the reques
                String jsonBody = "{" +
                        "   \"id\":\"20\",\n" +
                        "   \"name\":\"Hutch\",\n" +
                        "   \"status\":\"pending\"\n" +
                        "}";
                given()
                        .header("api_key", "special-key")
                           .accept(ContentType.JSON)
                           .contentType(ContentType.JSON)
                           .and()
                           .body(jsonBody)
                        .when()
                            .post("https://petstore.swagger.io/v2/pet")
                        .then()
                             .log().all()
                             .statusCode(200)
                             .body("status", equalTo("pending"))
                             .assertThat().header("Content-Type", "application/json");

            }


}
