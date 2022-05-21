package com.hibernate.jpa.advanced;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hibernate.jpa.hibernatejpa.entity.Person;
import com.hibernate.jpa.hibernatejpa.entity.repository.PersonJPARepository;

@SpringBootApplication
public class HibernateJpaApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(HibernateJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

}
