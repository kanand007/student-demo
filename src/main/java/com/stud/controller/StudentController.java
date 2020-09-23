package com.stud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stud.model.StudentDTO;
import com.stud.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public ResponseEntity<List<StudentDTO>> getStudents(){
		List<StudentDTO> studentDTOList = studentService.getStudents();
		return new ResponseEntity<>(studentDTOList,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
	public ResponseEntity<StudentDTO> getStudentById(@PathVariable(value = "id") Long id){
		StudentDTO studentDTO = studentService.getStudentById(id);
		return new ResponseEntity<>(studentDTO,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/student/add", method = RequestMethod.POST)
	public ResponseEntity<StudentDTO> addStudent(@RequestBody StudentDTO studentDTO) {
		studentService.addStudent(studentDTO);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@RequestMapping(value = "/student/update", method = RequestMethod.PUT)
	public ResponseEntity<StudentDTO> updateStudent(@RequestBody StudentDTO studentDTO) {
		studentService.updateStudent(studentDTO);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@RequestMapping(value = "/student/delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<StudentDTO> deleteStudentById(@PathVariable(value = "id") Long id) {
		studentService.deleteStudentById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
