package ${{values.java_package_name}};

import io.quarkus.test.junit.QuarkusIntegrationTest;

@QuarkusIntegrationTest
public class ${{values.component_id}}ResourceIT extends ${{values.component_id}}ResourceTest {
    // Execute the same tests but in packaged mode.
}
