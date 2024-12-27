package com.cdac.training.studentsoft.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.training.studentsoft.model.Student;
import com.cdac.training.studentsoft.service.StudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	
	@GetMapping("/")
	public String displayHomePage() {
		return "index";
	}
	
	@GetMapping("/new")
	public String getMethodName(Model m) {
		Student student =new Student();	
		m.addAttribute(student);	
		return "student-form"; //return view + student Object
	}
	
	@PostMapping("/students")
	public String postMethodName(@ModelAttribute("student") Student stud) {
		studentService.saveStudent(stud); //Invoke saveStudent() of Service Layer
		return "Success"; //redirect to students route - GET request	
	}


	

}
