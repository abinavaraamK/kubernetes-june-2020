package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestMethod;


@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/")
	public String home(@RequestParam ("fname") String fName, @RequestParam("lname") String lName) {
		String Name = fName + lName;
		return "Hello " + Name;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
