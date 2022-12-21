package com.example.restapidemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restapidemo.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
