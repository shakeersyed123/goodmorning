package com.springbootController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Client1Controller {
	@GetMapping("/name")

public String youname() {
	return "my name is shakeer";
}
}