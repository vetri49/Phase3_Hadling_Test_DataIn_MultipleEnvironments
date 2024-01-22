package com.simplilearn.restassuredtest;

import static org.hamcrest.CoreMatchers.equalTo;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class LoginRequestTest {
	private static final String BASE_URL = "https://reqres.in/api";
    private static final Logger logger = Logger.getLogger(LoginRequestTest.class);

    @Test(description = "Test on Login request with Rest assured")
    public void testOnLoginRequest() {

        logger.info("Start :: Test on Login request with Rest assured");
        String response = null;
        try {
            
            response = RestAssured.given().baseUri(BASE_URL).contentType(ContentType.JSON)
                    .body("{ \"email\": \"eve.holt@reqres.in\", \"password\": \"pistol\" }").when().post("/login")
                    .then().statusCode(200).and()
                    .body("token", equalTo("QpwL5tke4Pnpja7X4"))
                    .extract().asString();
        } catch (Exception e) {
            logger.error("Exception Object :: " + e.toString());
            logger.error("End Exception :: " + e.getLocalizedMessage());
        }
        logger.info("Response Object ::" + response);
        logger.info("End :: Test on Login request with Rest assured");
    }
}
