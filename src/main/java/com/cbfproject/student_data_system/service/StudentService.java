package com.cbfproject.student_data_system.service;

import com.cbfproject.student_data_system.model.Student;

import java.util.List;


public interface StudentService {
    public String createStudent(Student student);
    public String updateStudent(Student student);
    public String deleteStudent(Long studentId);
    public Student getStudent(Long studentId);
    public List<Student> getAllStudents();
}

