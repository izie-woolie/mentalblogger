package com.woolie.mentalblogger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MentalbloggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MentalbloggerApplication.class, args);
	}

}

@RestController
class SalutationController {
    @GetMapping("/")
    public String index() {
        return "This is the API of MentalBlogger";
    }
}
