package com.Docker;

import java.security.PublicKey;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	StudentRepo studentRepo;

	public List<Student> geta() {

		return studentRepo.findAll();
	}

	public Student add(Student student) {

		return studentRepo.save(student);
	}
	
	public Student findusinId(String id) {
		
		return  studentRepo.findById(id).get();

}}
