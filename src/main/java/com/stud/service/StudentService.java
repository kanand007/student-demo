package com.stud.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.stud.model.StudentDTO;

@Service
@Transactional
public interface StudentService {
	public void addStudent(StudentDTO studentDTO);
	
	public void deleteStudentById(Long sId);
	
	public void updateStudent(StudentDTO studentDTO);
	
	public StudentDTO getStudentById(Long sId);
	
	public List<StudentDTO> getStudents();
}
