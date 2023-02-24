package getRequesr;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.testng.Assert.*;

public class Get02 {

/*
    Given
        https://restful-booker.herokuapp.com/booking/78100
    When
        Kullanıcı GET Methodu ile Request Gönderir
    Then
        Status Code un "404" olduğunu Assert et
    And
        Response Body nin "Not Found" olduğunu assert et
    And
        Via nın "1.1 vegur" olduğunu assert et.
    And
        Response body nin "Clarusway" yazmadığını assert et
    And
        Status Line "HTTP/1.1 404 Not Found" olduğunu assert et.

     */


    @Test
    public void test(){

        /*
        1)Set Url
        2)Expected Data  suan ignored
        3)Send Requeat
        4)Assertion

         */

       // Step 1
        String URL = "http://restful-booker.herokuapp.com/booking/78100";

        // Step 2  ignie ediyoruz



        // Step 3  send request
        Response response = given().accept("application/json").when().get(URL);
        response.prettyPrint();

        // Step 4  Assertion

        // test 01                                        // test 2
        response.then().assertThat().statusCode(404).statusLine("HTTP/1.1 404 Not Found");
        // test 2
        // response.then().assertThat().statusLine("HTTP/1.1 404 Not Found");

        // test 3
        // Response body nasil stringe cevrilir
        String responseBodyStr = response.asString();
        System.out.println("responseBodyStr = " + responseBodyStr);

        assertTrue(responseBodyStr.contains("Not Found"));
        // test 4
        assertEquals("1.1 vegur",response.getHeader("Via"));

        // test 5
        assertFalse(responseBodyStr.contains("Clarusway"));


    }




}
