package com.martin.zaposleniciapi.zaposlenici;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD
=======
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
>>>>>>> cf1501d231965b6ef7b02d5d7b7b09f168b9b80c

@SpringBootApplication
@EnableAutoConfiguration
public class ZaposleniciApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZaposleniciApplication.class, args);
	}
}
