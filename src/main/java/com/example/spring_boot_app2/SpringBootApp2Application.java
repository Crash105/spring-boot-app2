package com.example.spring_boot_app2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringBootApp2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApp2Application.class, args);
	}

}
