package br.portoalegre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
// @EntityScan(basePackages = "br.portoalegre.car")
public class CardealershipApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardealershipApplication.class, args);
	}

}
