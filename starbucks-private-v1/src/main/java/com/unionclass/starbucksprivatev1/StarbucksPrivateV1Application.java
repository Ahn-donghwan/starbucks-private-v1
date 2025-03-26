package com.unionclass.starbucksprivatev1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class StarbucksPrivateV1Application {

	public static void main(String[] args) {
		SpringApplication.run(StarbucksPrivateV1Application.class, args);
	}

}
