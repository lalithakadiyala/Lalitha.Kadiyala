package Pet_Smart_Tests;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class Get_Pet_id {


    @Test(priority=0)
    public void getpet_status_available()
    {
        given()
                .when()
                .get("https://petstore.swagger.io/v2/pet/findByStatus?status=available")
                .then()
                .statusCode(200)
                //.body("pet", equalTo(1))
                .log().all()
                .assertThat().header("Content-Type", "application/json");
        System.out.println();

    }

    @Test(priority=0)
    public void getpet_status_pending()
    {
        given()
                .when()
                   .get("https://petstore.swagger.io/v2/pet/findByStatus?status=pending")
                .then()
                    .statusCode(200)
                    .log().all()
                    .assertThat().header("Content-Type", "application/json");

    }

    @Test(priority=0)
    public void getpet_status_sold()
    {
        given()
                .when()
                  .get("https://petstore.swagger.io/v2/pet/findByStatus?status=pending")
                .then()
                  .statusCode(200)
                  .log().all()
                //.body("status", equalTo("pending"))
                  .assertThat().header("Content-Type", "application/json");

    }

    @Test(priority=0)
    public void getpet_bypetid()
    {
        given()
                .when()
                  .get("https://petstore.swagger.io/v2/pet/20")
                .then()
                  .statusCode(200)
                  .log().all()
                //.body("status", equalTo("pending"))
                  .assertThat().header("Content-Type", "application/json");

    }



}
