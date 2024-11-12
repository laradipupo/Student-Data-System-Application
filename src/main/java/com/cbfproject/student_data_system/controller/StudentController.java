package com.cbfproject.student_data_system.controller;

import com.cbfproject.student_data_system.model.Student;
import com.cbfproject.student_data_system.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/students")
public class StudentController {

    StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    //get specific student details
    @GetMapping("{studentId}")
    public Student getStudent(@PathVariable("studentId") Long studentId) {
        return studentService.getStudent(studentId);
    }

    //    get all student details
    @GetMapping()
    public List<Student> getAllStudent() {
        return studentService.getAllStudents();
    }

    //    create student
    @PostMapping
    public String addStudent(@RequestBody Student student) {
        studentService.createStudent(student);
        return "Student added successfully";
    }

    //    update student
    @PutMapping
    public String updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
        return "Student updated successfully";
    }

    //delete student
    @DeleteMapping("{studentId}")
    public String deleteStudent(@PathVariable("studentId") Long studentId) {
        studentService.deleteStudent(studentId);
        return "Student deleted successfully";
    }
}

