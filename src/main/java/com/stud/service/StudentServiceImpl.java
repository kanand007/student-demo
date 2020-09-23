package com.stud.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.stud.entity.Student;
import com.stud.mapper.StudentMapper;
import com.stud.model.StudentDTO;
import com.stud.repository.StudentRepository;

@Service(value="student")
public class StudentServiceImpl implements StudentService {
	@Resource
	private StudentRepository studentRepository;

	@Override
	public void addStudent(StudentDTO studentDTO) {
		studentRepository.save(StudentMapper.mapToStudentEntity(studentDTO));
	}

	@Override
	public void deleteStudentById(Long sId) {
		studentRepository.deleteById(sId);
	}

	@Override
	public void updateStudent(StudentDTO studentDTO) {
		Student student = studentRepository.findById(studentDTO.getStudId()).get();
		if (null != studentDTO.getDob()) {
			student.setDob(studentDTO.getDob());
		}else if(null!=studentDTO.getName()) {
			student.setName(studentDTO.getName());
		}else if(null!=studentDTO.getEmail()) {
			student.setEmail(studentDTO.getEmail());
		}else if(null!=studentDTO.getStudyClass()) {
			student.setStudyClass(studentDTO.getStudyClass());
		}
		studentRepository.save(student);
	}

	@Override
	public StudentDTO getStudentById(Long sId) {
		return StudentMapper.mapToStudentDTO(studentRepository.findById(sId).get());
	}

	@Override
	public List<StudentDTO> getStudents() {
		
		return StudentMapper.mapToStudentDTOs(studentRepository.findAll());
	}
	
	
}
