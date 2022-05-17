package com.translatorv10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Translatorv10Application {


	public static void main(String[] args) {
		SpringApplication.run(Translatorv10Application.class, args);

	}


}