package com.cbfproject.student_data_system.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
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
