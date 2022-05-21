package pokemonapi;

import io.restassured.http.ContentType;
import org.junit.Test;
import static io.restassured.RestAssured.given;


public class UserTest {

    private static final String ENDPOINT = "https://pokeapi.co/api/v2/pokemon/";
    private static final String POKEMON = "charmander";

    @Test
    public void test() {
        given()
                .header("Accept", "Content-type: application/json; charset=utf-8")
          .when()
                .get(ENDPOINT + POKEMON).then().log().all().extract().response()
          .then()
                .statusCode(200)
                .contentType(ContentType.JSON);
    }
}