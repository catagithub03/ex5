package com.ibm.academy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApplicationData implements CommandLineRunner {

	@Autowired
	//private InstanceRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplicationData.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//repository.deleteAll();

		

	}

}
