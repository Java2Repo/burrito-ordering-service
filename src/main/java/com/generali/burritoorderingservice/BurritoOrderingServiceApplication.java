package com.generali.burritoorderingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@ComponentScan("com.generali.burritoorderingservice.*")
public class BurritoOrderingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BurritoOrderingServiceApplication.class, args);
	}

}
