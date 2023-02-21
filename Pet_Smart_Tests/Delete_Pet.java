package Pet_Smart_Tests;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;


import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class Delete_Pet {
    @Test(priority=0)
    public void delete_pet_byid(){
        given()
                        .header("api_key", "special-key")
                           .accept(ContentType.JSON)
                           .contentType(ContentType.JSON)

                        .when()
                            .delete("https://petstore.swagger.io/v2/pet/9")
                        .then()
                             .log().all()
                             .statusCode(200)
                             //.body("status", equalTo("pending"))
                            .assertThat().header("Content-Type", "application/json");

}

}
