package br.com.o2junior.batchprocessing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BatchProcessingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BatchProcessingApplication.class, args);

		// Test Create Person
		// Person person_test = new Person("Euripedes", "Marcio");
		// System.out.println(person_test);
	}

}
