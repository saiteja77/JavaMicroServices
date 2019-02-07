package com.microservice.springcloudconfigserves;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigServesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServesApplication.class, args);
	}

}

