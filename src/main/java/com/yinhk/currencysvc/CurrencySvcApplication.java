package com.yinhk.currencysvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.oas.annotations.EnableOpenApi;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@EnableWebMvc
//@EnableSwagger2
@EnableOpenApi
@SpringBootApplication
public class CurrencySvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencySvcApplication.class, args);
	}

}
