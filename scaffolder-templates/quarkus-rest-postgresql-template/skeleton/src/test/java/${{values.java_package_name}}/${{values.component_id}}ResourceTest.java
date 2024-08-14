package ${{values.java_package_name}};

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ${{values.component_id}}ResourceTest {
    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("${{values.api_endpoint}}")
                .then()
                .statusCode(200)
                .body(is("Hello from RESTEasy Reactive"));
    }

}