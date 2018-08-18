package com.example.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}
	
	@GetMapping("/cr")
	public String getClientResponse() {

		RestTemplate template = new RestTemplate();

		String url="http://server:8080/sr";
		String response = template.getForObject(url, String.class);

		return response;

	}
}
