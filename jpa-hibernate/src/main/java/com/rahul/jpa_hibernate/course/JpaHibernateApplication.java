package com.rahul.jpa_hibernate.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaHibernateApplication.class, args);
	}
	// when spring boot application starts, the classes that implement the command line runner interface have a run method
	// that 'runs' at startup

}
