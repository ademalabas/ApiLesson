package baseURLs;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class GoRestCoBaseURL {


    ///https://gorest.co.in/public/v2  ===,> BASE URL

    protected RequestSpecification specification;

    @Before
    public void setUpBaseURL() {

        specification = new RequestSpecBuilder().
                setBaseUri("https://gorest.co.in/public/v2").
                build();

    }


    }
