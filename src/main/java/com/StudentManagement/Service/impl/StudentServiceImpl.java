package com.StudentManagement.Service.impl;

import com.StudentManagement.Dto.StudentDto;
import com.StudentManagement.Entity.Student;
import com.StudentManagement.Service.StudentService;
import com.StudentManagement.exception.StudentNotFoundException;
import com.StudentManagement.repository.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    public StudentServiceImpl(StudentRepository studentRepository, ModelMapper modelMapper) {
        this.studentRepository = studentRepository;
        this.modelMapper = modelMapper;
    }



    @Override
    public StudentDto saveStudent(StudentDto studentDto) {
        Student student = modelMapper.map(studentDto, Student.class);
        Student savedStudent = studentRepository.save(student);
        return modelMapper.map(savedStudent, StudentDto.class);
    }

    @Override
    public Page<StudentDto> getAllStudents(Pageable pageable) {
        return studentRepository.findAll(pageable).map(student -> modelMapper.map(student, StudentDto.class));
    }


    @Override
    public StudentDto getStudentById(Long id) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException("Student not found with: "+ id) );
        return modelMapper.map(student, StudentDto.class);
    }

    @Override
    public StudentDto updateStudent(StudentDto studentDto, Long id) {
        Student studentExist = studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException("Student not found with: "+ id) );
        studentExist.setFirstName(studentDto.getFirstName());
        studentExist.setLastName(studentDto.getLastName());
        studentExist.setEmail(studentDto.getEmail());
        studentExist.setCourse(studentDto.getCourse());
        Student updatedStudent = studentRepository.save(studentExist);
        return  modelMapper.map(studentExist, StudentDto.class);

    }

    @Override
    public void deleteStudentById(Long id) {
        if(!studentRepository.existsById(id)){
            throw new StudentNotFoundException("Student not found with: "+ id);
        }
        studentRepository.deleteById(id);
    }


}
