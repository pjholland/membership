package membership.backend;

import com.jayway.restassured.RestAssured;

import static com.jayway.restassured.RestAssured.*;


public class BaseClassRestAssured {

    public static void connectToApi(){

        RestAssured.baseURI = "https://now-cook-it-backend.development.nowcookit.co.uk/";
    }
}
