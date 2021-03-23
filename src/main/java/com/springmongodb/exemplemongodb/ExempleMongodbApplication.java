package com.springmongodb.exemplemongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ExempleMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExempleMongodbApplication.class, args);
	}

}
