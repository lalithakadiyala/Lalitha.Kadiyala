package Pet_Smart_Tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class Get_Pet_id {
    @Test
    public void getpet_available()
    {
        given()
                .when()
                .get("https://petstore.swagger.io/v2/user/login")
                //.get("https://petstore.swagger.io/v2/pet/findByStatus?status=available")
                .then()
                .statusCode(200)
                .assertThat().header("Content-Type", "application/json");
        System.out.println();

    }

    @Test
    public void getpet_pending()
    {
        given()
                .when()
                .get("https://petstore.swagger.io/v2/pet/findByStatus?status=pending")
                .then()
                .statusCode(200)
                .assertThat().header("Content-Type", "application/json");

    }

    @Test
    public void getpet_id()
    {
        given()
                .when()
                .get("https://petstore.swagger.io/v2/pet/0")
                .then()
                .statusCode(200)
                .assertThat().header("Content-Type", "application/json");

    }
}
