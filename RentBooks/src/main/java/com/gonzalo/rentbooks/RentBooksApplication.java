package com.gonzalo.rentbooks;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.FixedLocaleResolver;

@SpringBootApplication
public class RentBooksApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentBooksApplication.class, args);
	}
	
	 @Bean
	    public LocaleResolver localeResolver() {
	        return new FixedLocaleResolver(Locale.ENGLISH);
	    }

}
