package com.Docker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage.Body;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;

	@GetMapping("/getall")
	public ResponseEntity<List<Student>>getall(){
	
		return  ResponseEntity.status(HttpStatus.OK).body(studentService.geta());
	}
	
	@PostMapping("/add")
	public ResponseEntity<Student>add(@RequestBody Student student)
	{
		return ResponseEntity.status(HttpStatus.OK).body(studentService.add(student));
	}
	
}
