package com.cdac.training.studentsoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.training.studentsoft.dao.StudentDAO;
import com.cdac.training.studentsoft.model.Student;

@Service
public class StudentService {
	
		
		// INject StudentDAO object to call DAO class Methods
		@Autowired
		private StudentDAO studentDAO;
		
		public int saveStudent(Student stud) {
			return studentDAO.save(stud);
		}


}
