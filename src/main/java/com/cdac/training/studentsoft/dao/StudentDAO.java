package com.cdac.training.studentsoft.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cdac.training.studentsoft.model.Student;

@Repository
public class StudentDAO {
	
	/*
	 * JdbcTemplate is a powerful tool in Spring Boot that simplifies database interactions. 
	 * It allows you to interact with the database using a simple, template-based model. 
	 * With JdbcTemplate, you can execute SQL statements, retrieve data, and perform CRUD operations. 
	 * Spring Boot provides an automatically configured JdbcTemplate instance, making it easy to use in 
	 * your applications. 
	 * You can inject the JdbcTemplate instance into your Spring Boot beans and use its methods to perform 
	 * database operations. 
	 * JdbcTemplate is a great choice for simplifying database integration in your 
	 * Spring Boot projects.
	 */
	// DI using Field Injection
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	// ? - placeholder symbol  - values will be inserted from FORM at run-time
		public int save(Student stud) {	
			String sql="INSERT INTO student(firstName,lastName,gender,course) VALUES (?,?,?,?)";
			//update() is predefined method of JdbcTemplate to insert Record
			return jdbcTemplate.update(sql,stud.getFirstName(),stud.getLastName(),
					stud.getGender(),stud.getCourse()); 
		}

}