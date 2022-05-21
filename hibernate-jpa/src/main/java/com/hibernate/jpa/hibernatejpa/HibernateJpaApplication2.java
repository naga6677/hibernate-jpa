package com.hibernate.jpa.hibernatejpa;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hibernate.jpa.x.hibernatejpa.entity.Person;
import com.hibernate.jpa.x.hibernatejpa.entity.repository.PersonJPARepository;

//@SpringBootApplication
public class HibernateJpaApplication2  implements CommandLineRunner{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJPARepository repository;

	public static void main(String[] args) {
		SpringApplication.run(HibernateJpaApplication2.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("User id 1001 -> {}", repository.findById(10001));
		
		logger.info("Inserting -> {}", 
				repository.insert(new Person("Tara", "Berlin", new Date())));
		
		logger.info("Update 1003 -> {}", 
				repository.update(new Person(10003, "Pieter", "Utrecht", new Date())));
		
		repository.deleteById(1003);

		logger.info("All users -> {}", repository.findAll());
		
	}

}
