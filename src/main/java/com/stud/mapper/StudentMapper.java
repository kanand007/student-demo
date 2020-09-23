package com.stud.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.stud.entity.Student;
import com.stud.model.StudentDTO;

public class StudentMapper {

	public static List<StudentDTO> mapToStudentDTOs(List<Student> studentList){
		return studentList.stream().map(StudentMapper::mapToStudentDTO).collect(Collectors.toList());
	}
	
	public static List<Student> mapToStudentEntities(List<StudentDTO> studentDTOs){
		return studentDTOs.stream().map(StudentMapper::mapToStudentEntity).collect(Collectors.toList());
	}
	
	public static StudentDTO mapToStudentDTO(Student student) {
		StudentDTO studentDTO=new StudentDTO();
		studentDTO.setStudId(student.getStudId());
		studentDTO.setName(student.getName());
		studentDTO.setEmail(student.getEmail());
		studentDTO.setStudyClass(student.getStudyClass());
		studentDTO.setDob(student.getDob());
		return studentDTO;
	}
	
	public static Student mapToStudentEntity(StudentDTO studentDTO) {
		Student student = new Student();
		student.setStudId(studentDTO.getStudId());
		student.setDob(studentDTO.getDob());
		student.setName(studentDTO.getName());
		student.setEmail(studentDTO.getEmail());
		student.setStudyClass(studentDTO.getStudyClass());
		return student;
	}
}
