package getRequesr;

import io.restassured.internal.RequestSpecificationImpl;
import org.junit.Test;

public class Get09 {

     /*

    Given
	   	     https://jsonplaceholder.typicode.com/todos/2
		When
			Kullanıcı GET Methodu ile Request Gönderir
		Then
			 Status Code un "200" olduğunu Assert et
		And
            Header da Server ın cloudflare olduğunu Assert et
		And
		     Response body nin bu şekilde olduğunu doğrular
  {
    "userId": 1,
    "id": 2,
    "title": "quis ut nam facilis et officia qui",
    "completed": false
}


     */



    @Test
    public void get07() {

        /*
        1) Set URL
        2) Set Expected Data
        3) Send a Request
        4) Assertion
         */


        // STep 1: Set URL
        //	   	     https://jsonplaceholder.typicode.com/todos/2

        specification.pathParam("todosPath", "todos","idPath","2");


        // Step 2: Expected Data (ignored)


        // Step 3: Send a request


    }


    }
