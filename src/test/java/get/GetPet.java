package get;

import io.restassured.RestAssured;
import org.junit.Test;

public class GetPet {

    @Test
    public void getPetTest(){
        RestAssured.given()
                .header("Accept","application/json")
                .when().get("https://petstore.swagger.io/v2/pet/775")
                .then().statusCode(405);

    }

    @Test

    public void itunesTest(){

        RestAssured.given()
                .header("Accept","application/json")
                .param("term","1")
                .param("term","thebeatles")
                .when()
                .get("https://itunes.apple.com/search")
                .then().statusCode(200);

    }
}
