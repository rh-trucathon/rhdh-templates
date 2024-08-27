package ${{values.java_package_name}};

import io.quarkus.test.junit.QuarkusIntegrationTest;

@QuarkusIntegrationTest
class ${{values.component_id}}ControllerIT extends ${{values.component_id}}ControllerTest {
    // Execute the same tests but in packaged mode.
}
