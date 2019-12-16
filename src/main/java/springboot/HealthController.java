package springboot;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

	  @GetMapping("/Health")
	  public String greeting() {
	    return "Je suis UP!";
	  }
}
