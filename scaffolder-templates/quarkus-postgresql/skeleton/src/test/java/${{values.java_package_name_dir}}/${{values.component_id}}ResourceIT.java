package ${{values.java_package_name}};

import io.quarkus.test.junit.QuarkusIntegrationTest;

@QuarkusIntegrationTest
class HeroResourceIT extends HeroResourceTest {
    // Execute the same tests but in packaged mode.
}
