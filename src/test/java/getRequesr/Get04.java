package getRequesr;

import baseURLs.JsonPlaseHolderBaseURL;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Get04 extends JsonPlaseHolderBaseURL {

  /*
        Given
            https://jsonplaceholder.typicode.com/users
        When
             Kullanıcı GET Methodu ile Request Gönderir
        Then
            Status Code un "200" olduğunu Assert et
		And
            Content Type ın "application/json" olduğunu assert et
		And
		    Data uzunluğunun 10 olduğunu assert ediniz.

     */


    @Test
    public void get04() {

          /*
        1)Set Url
        2)Expected Data  suan ignored
        3)Send Requeat
        4)Assertion

         */

        // Step 1  set URL  "https://jsonplaceholder.typicode.com/todos/2"

        specification.pathParams("userPath","users");

        // Step 2 Expected Data  ignore ediyoruz


        // Step 3  send request
        Response response = given().
                spec(specification).
                when().
                get("/{userPath}");

        response.prettyPrint(); // like sout

        // Step 4: Assertion operations

       /* Then
        Status Code un "200" olduğunu Assert et
                And
        Content Type ın "application/json" olduğunu assert et
        And
        Data uzunluğunun 10 olduğunu assert ediniz.

        */

        response.then().
                assertThat().
                statusCode(200).
                contentType(ContentType.JSON).body("id", Matchers.hasSize(10));




    }






}
