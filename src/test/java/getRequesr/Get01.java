package getRequesr;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Get01 {

    /*

     */


    /*
    Given
        https://restful-booker.herokuapp.com/booking/7
    When
        Kullanıcı GET Methodu ile Request Gönderir
    Then
        Status Code un "200" olduğunu Assert et
    And
        Content Type ın "application/json" olduğunu assert et
    And
        Status Line "HTTP/1.1 200 OK" olduğunu assert et.

     */

    @Test
    public void get01(){
       /*
       4 tane adimimiz var

       1 URL i tanimamam lazim URL i set etmem lazim

       2 Expected datalari tanimlamam lazim Expected datalari set etmem lazim
       Test caseden alinir Doc tan alinir (Suan icin bu step ignore yapilacak

       3 Request gonder

       4 Assertion islemi
        */

        //  Step 1 ; URL i set ediniz. https://restful-booker.herokuapp.com/booking/7

        String URL ="https://restful-booker.herokuapp.com/booking/7";


        //  Step 2 ; Expected datalari set et (Ignore etmistik)


        //  Step 3; Request gonder

        Response response = given().when().get(URL);
       // Response response = given().accept(ContentType.JSON).when().get(URL);

        System.out.println("response = " + response);
        response.prettyPrint();// sout gibidir


//  Test 01

        response.then().assertThat().statusCode(200);//Doc tast case den alindi

//  Test 02 Content type

        response.then().assertThat().contentType("application/json");

        response.then().assertThat().contentType(ContentType.JSON);

        //  Test 03 Status Line
        response.then().assertThat().statusLine("HTTP/1.1 200 OK");


        System.out.println("Status Code :" +response.getStatusCode());


        System.out.println("Content Type :"+ response.getContentType());

        System.out.println("Status line : " + response.getStatusLine());

        System.out.println("Response Time : " + response.getTime());

        System.out.println("Headers : " + response.getHeaders());



    }



}
