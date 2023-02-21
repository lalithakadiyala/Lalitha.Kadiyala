package Pet_Smart_Tests;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;

public class Put_Pet_info {
    String jsonBody = "{" +
            "   \"id\":\"20\",\n" +
            "   \"name\":\"Hutch\",\n" +
            "   \"status\":\"sold\"\n" +
            "}";
   @Test
   public void update_pet(){
    given()
            .header("api_key", "special-key")
                        .accept(ContentType.JSON)
                        .contentType(ContentType.JSON)
                        .and()
                        .body(jsonBody)
            .when()
                        .put("https://petstore.swagger.io/v2/pet")
           .then()
                        .log().all()
                        .statusCode(200)
                        .body("status", equalTo("sold"))
                        .assertThat().header("Content-Type", "application/json");

}



}
