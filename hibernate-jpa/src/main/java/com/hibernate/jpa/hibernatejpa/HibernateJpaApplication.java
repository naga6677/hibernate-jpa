package com.hibernate.jpa.hibernatejpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hibernate.jpa.hibernatejpa.advanced.entities.Course;
import com.hibernate.jpa.hibernatejpa.advanced.repository.CourseRepository;

@SpringBootApplication
public class HibernateJpaApplication  implements CommandLineRunner{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private CourseRepository tCourseRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(HibernateJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Course tCourse  = tCourseRepository.findById(new Long(1001));
		logger.info("The Course is -> {}", tCourse);

	}

}
