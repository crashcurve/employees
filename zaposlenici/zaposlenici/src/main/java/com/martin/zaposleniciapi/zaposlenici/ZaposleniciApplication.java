package com.martin.zaposleniciapi.zaposlenici;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableAutoConfiguration
public class ZaposleniciApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZaposleniciApplication.class, args);
	}
}
