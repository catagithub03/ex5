package com.ibm.academy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
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
	
	@Bean
	public Docket swaggerApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.ibm.academy.controller")).paths(PathSelectors.any()).build()
				.apiInfo(new ApiInfoBuilder().version("1.0").title("Employee Management API Skills Academy OpenShift")
						.description("Employee Management API Skills Academy v1.0").build());
	}

}
