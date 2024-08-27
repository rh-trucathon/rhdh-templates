import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${{values.api_endpoint}}")
public class ${{values.component_id}}Controller {

    @GetMapping
    public String hello() {
        return "Hello Spring";
    }
}