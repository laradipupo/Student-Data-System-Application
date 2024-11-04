package com.cbfproject.student_data_system.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student lara = new Student(
                    1L,
                    "Lara",
                    "Oladipupo",
                    "lara@gmail.com",
                    LocalDate.of(2000, Month.OCTOBER, 4),
                    "Derbyshire",
                    "Microbiology"
            );

            Student victoria = new Student(
                    "Victoria",
                    "Oladipupo",
                    "lara@gmail.com",
                    LocalDate.of(2000, Month.OCTOBER, 4),
                    "Derbyshire",
                    "Microbiology"
            );

            repository.saveAll(
                    List.of(lara, victoria)
            );
        };
    }
}
