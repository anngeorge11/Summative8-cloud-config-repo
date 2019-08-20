package com.trilogyed.cloudconfigservicetasker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudConfigServiceTaskerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigServiceTaskerApplication.class, args);
	}

}
