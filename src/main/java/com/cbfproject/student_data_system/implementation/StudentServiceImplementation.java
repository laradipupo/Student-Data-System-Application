package com.cbfproject.student_data_system.implementation;

import com.cbfproject.student_data_system.exception.StudentNotFoundException;
import com.cbfproject.student_data_system.model.Student;
import com.cbfproject.student_data_system.repository.StudentRepository;
import com.cbfproject.student_data_system.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImplementation implements StudentService {

    StudentRepository studentRepository;


    public StudentServiceImplementation(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public String createStudent(Student student) {
        studentRepository.save(student);
        return "Student created successfully";
    }

    @Override
    public String updateStudent(Student student) {
        studentRepository.save(student);
        return "Student updated successfully";
    }

    @Override
    public String deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
        return "Student deleted successfully";
    }

    @Override
    public Student getStudent(Long studentId) {
        if(studentRepository.findById(studentId).isEmpty())
            throw new StudentNotFoundException("Student does not exist");
        return studentRepository.findById(studentId).get();
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
