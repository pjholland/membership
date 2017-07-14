package membership.backend;

import com.jayway.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;


public class BaseClassRestAssured {

    public static void connectToApi(){

       // RestAssured.baseURI = "https://www-origin-api.qa.meaningfulplatform.co.uk:9754/apidocs/#!/";

        String username = "qTVLAPkbVuwXbh4etMyKoNa3N7F3TncepRhEFpykuyUprwhupgKX37PWEhofohin";
        String password = "MAebHrt9vfqoYwpM7yzsymybAaihUemKhfuNsfRdVufWwkzm37NhxAaTqWsiygqd";

        RestAssured.basic(username, password);
    }

    @Test
    public  void createColleagueId()  {

        connectToApi();

        given()
                .contentType(ContentType.JSON)
                .get("https://www-origin-api.qa.meaningfulplatform.co.uk:9754/apidocs/#!/employee/updateEmployees")
                .then()
                .statusCode(200);
        when()
                .post("https://www-origin-api.qa.meaningfulplatform.co.uk:9754/apidocs/#!/employee/updateEmployees")
                .then();





    }


}
