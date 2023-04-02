package com.r2data.hackathonassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HackathonassignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(HackathonassignmentApplication.class, args);

		// decrease springboot application startup time
		System.setProperty("spring.devtools.restart.enabled", "false");

		// optimise springboot application startup time
		System.setProperty("spring.main.lazy-initialization", "true");

		// optimise springboot application startup time
		System.setProperty("spring.main.allow-bean-definition-overriding", "true");

		// optimise springboot application startup time
		System.setProperty("spring.main.web-application-type", "none");

		// optimise springboot application startup time
		System.setProperty("spring.main.banner-mode", "off");

		// optimise springboot application startup time
		System.setProperty("spring.main.log-startup-info", "false");

		// optimise springboot application startup time
		System.setProperty("spring.main.register-shutdown-hook", "false");

		// optimise springboot application startup time
		System.setProperty("spring.main.sources", "none");

		// optimise springboot application startup time
		System.setProperty("spring.main.web-environment", "false");

		// optimise springboot application startup time
		System.setProperty("spring.main.add-converters", "false");

		// optimise springboot application startup time
		System.setProperty("spring.main.additional-locations", "none");

		// optimise springboot application startup time
		System.setProperty("spring.main.banner-location", "none");

	}

}
