package com.example.restapidemo.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.restapidemo.dto.StudentDTO;
import com.example.restapidemo.entities.Student;

@Component
public interface StudentService {
	
	public Student createStudent(StudentDTO st);
	public Student getStudent(int id);
	public List<Student> getAllStudents();
	public String deleteStudent(int id);
	public String updateStudent(int id,StudentDTO st);
	public Student updateStudentName(int id, String name);
	public String deleteAllStudents();

}
