package com.cloud.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ClientApplication implements CommandLineRunner {

	private Logger logger= LoggerFactory.getLogger(ClientApplication.class);

	@Value("${application.userName}")
	private String username;

	@Value("${application.secretKey}")
	private String secretKey;

	@Value("${application.url}")
	private String url;

	@Value("${local.accessKey}")
	private String localAccessKey;


	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("=====================>\n ");
		logger.info("User Name is : {}", username);
		logger.info("secretKey : {}", secretKey);
		logger.info("url is : {}", url);
		logger.info("localAccessKey : {}", localAccessKey);
	}
}
