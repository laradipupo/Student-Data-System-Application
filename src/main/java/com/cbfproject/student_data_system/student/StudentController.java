package com.cbfproject.student_data_system.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "/student")
public class StudentController {

    @GetMapping
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Lara",
                        "Oladipupo",
                        "lara@gmail.com",
                        LocalDate.of(2000, Month.OCTOBER, 4),
                        "Derbyshire",
                        "Microbiology"
                )
        );
    }
}
