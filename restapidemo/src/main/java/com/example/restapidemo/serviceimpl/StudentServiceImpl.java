package com.example.restapidemo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restapidemo.dto.StudentDTO;
import com.example.restapidemo.entities.Student;
import com.example.restapidemo.repositories.StudentRepository;
import com.example.restapidemo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository sr;
	
	@Override
	public Student createStudent(StudentDTO st1) {
		Student st=Student.builder()
				.name(st1.getName()).contact(st1.getContact()).build();
		return sr.save(st);
	}

	@Override
	public Student getStudent(int id) {
		return sr.findById(id).get();
	}

	@Override
	public List<Student> getAllStudents() {
		return sr.findAll();
	}

	@Override
	public String deleteStudent(int id) {
		sr.deleteById(id);
		return "Record deleted successfully..";
	}

	@Override
	public String updateStudent(int id, StudentDTO st) {
		Student s=sr.findById(id).get();
		
		Student s1=Student.builder()
				.id(id)
				.name(st.getName())
				.contact(st.getContact())
				.build();
				
		
//		s.setName(st.getName());
//		s.setContact(st.getContact());
		sr.save(s1);
		return "Resord updated successfully...";
	}

	@Override
	public Student updateStudentName(int id, String name) {
		Student s=sr.findById(id).get();
		s.setName(name);
		return sr.save(s);
		
	}

	@Override
	public String deleteAllStudents() {
		sr.deleteAll();
		return "All students deleted...";
	}

}
