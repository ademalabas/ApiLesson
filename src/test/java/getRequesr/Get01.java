package getRequesr;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Get01 {

    /*
Bizler bu zamana kadar sizler ile birlikte POSTMAN üzerinde farklı doc. sahip olan
        çeşitli API lere request attık.
        REq atarken HTTP methodların da GET, POST; PUT, PATCH and DELETE methoslarınınkullandık.



        Bizler markete genle olarak POSTMAN i bir otomasyon toolu olarak değil manule test tool u olarka
        kullanıyoruz. Fakat dersler de işlediğimiz üsere PSTAMN ile test otomasyonu yapabiliyoruz.

        API testlerimiz bundan sonra REstAssured Lib. kullanrak yapacğaız.


        TEST leri yapabiliyor olmak içn sizlerin bir doc. ihtiyacı vardır.
        Biz test eng. bu doc. göre API leri nasıl kullanacağımız veya nasıl test edeceğimizi öğreniriz.

        Ve doc. lara göre çeşitli seneryoalr oluşturabiliriz. Tıpkı ne gibi?
        Selenium Web UI teslteri koştuğumuz gibi.

        Test Case:

         --> Expected Result


         ---> Actual Result      ====>>>>> Response dan alacağım.


        Gherkin Lang.

            Given ---> testin yapılabilmesi için ön hazırlık/ön şart
            When ---> Action --> Gerçekleştirilecek Eylemler
            Then ---> Assertion için kullanıyoruz
            And  ---> Öncesinde kullanılan keyword u etkisinin hala devame titğini zilere gösterir.

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

    @Test   // -> it is like it main method
    public void get01(){
       /*
       4 tane adimimiz var

       1 URL i tanimamam lazim URL i set etmem lazim

       2 Expected datalari tanimlamam lazim Expected datalari set etmem lazim
       Test caseden alinir Doc tan alinir (Suan icin bu step ignore yapilacak

       3 Request gonder   Post manmdeki SEND butonu

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

        //Status Code u konsola nasıl yazdırabiliriz?
        System.out.println("Status Code :" +response.getStatusCode());

        // Contetnt Type ı konsola nasıl yazdırabilirim?
        System.out.println("Content Type :"+ response.getContentType());

        //Status Line ı nasıl yazdırabilrim
        System.out.println("Status line : " + response.getStatusLine());

        //REsponse Time ı nasıl yazdırabilirim
        System.out.println("Response Time : " + response.getTime());

        //Headers ları konsola nasıl yazdıarbilriim?
        System.out.println("Headers : " + response.getHeaders());



    }



}
