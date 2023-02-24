package getRequesr;

import baseURLs.JsonPlaseHoldrBaseURL;
import io.restassured.response.Response;
import org.junit.Test;
import org.testng.Assert;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Get03 extends JsonPlaseHoldrBaseURL {


/*
        Given
            https://jsonplaceholder.typicode.com/todos/2
        When
             Kullanıcı GET Methodu ile Request Gönderir
        Then
            Status Code un "200" olduğunu Assert et
		And
            Content Type ın "application/json" olduğunu assert et
		And
		    title ın "quis ut nam facilis et officia qui" olduğunu verify et.,
		And
		    "completed" ın false olduğunu verify et.
		And
		    "userId" in 1 olduğunu verify et
     */
    /*
    {
    "userId": 1,
    "id": 2,
    "title": "quis ut nam facilis et officia qui",
    "completed": false
}
     */



    @Test
    public void test03() {

        /*
        1)Set Url
        2)Expected Data  suan ignored
        3)Send Requeat
        4)Assertion

         */


// Step 1  set URL  "https://jsonplaceholder.typicode.com/todos/2"

        specification.pathParams("todosPath","todos",
                "idPath","2");
        // Step 2 Expected Data  ignore ediyoruz


        // Step 3  send request
        Response response = given().
                spec(specification).
                when().
                get("/{todosPath}/{idPath}");

        response.prettyPrint(); // like sout

        // Step 4: Assertion operations


        /*
        String URL = "https://jsonplaceholder.typicode.com/todos/2";
        Response response = given().when().get(URL);

        response.prettyPrint();

        response.then().assertThat().statusCode(200)
                .contentType("application/json")
                .body("title", equalTo("quis ut nam facilis et officia qui"))
                .body("completed", equalTo(false))
                .body("userId", equalTo(1));

        Assert.assertTrue(response.asString().contains("\"completed\": false"));
    }

*/

    }

    }


