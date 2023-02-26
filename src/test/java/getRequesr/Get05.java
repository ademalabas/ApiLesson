package getRequesr;

import baseURLs.TheMovieDBBaseURL;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Get05 extends TheMovieDBBaseURL {

/*
        Given
            https://api.themoviedb.org/3/movie/popular

            apı_key = 360c774b8ced8a69a0d03a1fed4ff9f5
        When
             Kullanıcı GET Methodu ile Request Gönderir
        Then
            Status Code un "200" olduğunu Assert et
		And
            Content Type ın "application/json" olduğunu assert et
		And
		    id lerin içerisnde
		    646389
            536554
            640146 olduğunu assert ediniz.

     */


    @Test
    public void get05() {

          /*
        1)Set Url
        2)Expected Data  suan ignored
        3)Send Requeat
        4)Assertion

         */

        // Step 1  set URL  "https://jsonplaceholder.typicode.com/todos/2"

        specification.pathParams("moviePath", "movie",
                "popularPath", "popular").queryParams("api_key",
                "360c774b8ced8a69a0d03a1fed4ff9f5");


        // Step 2 Expected Data  ignore ediyoruz



        // Step 3  send request
        Response response = given().spec(specification)
                .when().get("/{moviePath}/{popularPath}");// get metodumun içierisne çalışacğaım endpoşntleri sytanx ıne uygun bir şekilde yazmalıyım.


        response.prettyPrint(); // like sout

        // Step 4: Assertion operations

      /*  Then
        Status Code un "200" olduğunu Assert et
                And
        Content Type ın "application/json" olduğunu assert et
        And
        id lerin içerisnde
        646389
        536554
        640146 olduğunu assert ediniz.

                */


        response.then().
                assertThat().
                statusCode(200).
                contentType(ContentType.JSON).
                body("results.id", Matchers.hasItems(646389,536554,640146));


    }


}
