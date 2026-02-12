package com.StudentManagement.Service;

import com.StudentManagement.Dto.StudentDto;
import com.StudentManagement.Entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface StudentService {
    StudentDto saveStudent(StudentDto studentDto);
    Page<StudentDto> getAllStudents(Pageable pageable);
    StudentDto getStudentById(Long id);
    StudentDto updateStudent(StudentDto studentDto,Long id);
    void deleteStudentById(Long id);
}
