package com.hibernate.jpa.hibernatejpa.advanced.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hibernate.jpa.hibernatejpa.advanced.entities.Course;

@Repository
public class CourseRepository {

	@Autowired
	private EntityManager entityManager;

	public Course findById(Long id) {
		Course course = entityManager.find(Course.class, id);
		return course;
	}

	public Course save(Course acourse) {
		return acourse;

	}

	public void deleteById(Long id) {

	}

}
