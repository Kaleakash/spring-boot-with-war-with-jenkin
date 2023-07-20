package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

	@GetMapping(value = "/")
	public String sayHello() {
		return "Welcome to Spring boot with war deploy using jenkin";
	}
}
