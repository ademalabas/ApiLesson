package homework;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class HW24_02 {


    @Test()
    public void test() {


        String URL = "https://jsonplaceholder.typicode.com/todos/2";

        Response rs = given().when().get(URL);
        System.out.println("RESPONSE: ");
        rs.prettyPrint();
        rs.then().assertThat().statusCode(200);
        rs.then().assertThat().body("completed", equalTo(false));
        rs.then().assertThat().body("userId", equalTo(1));
        rs.then().assertThat().body("title", equalTo("quis ut nam facilis et officia qui"));
        rs.then().assertThat().headers("Via", equalTo("1.1 vegur"));
        rs.then().assertThat().headers("Server", equalTo("cloudflare"));
        rs.then().assertThat().body("title", containsString("qui"));


    }
}