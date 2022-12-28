package com.example.demo.student;

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
            Student cornel = new Student(
                    1L,
                    "Cornel",
                    "cornel.stefan@gmail.com",
                    LocalDate.of(1994, Month.AUGUST,18)
            );

            Student cristina = new Student(
                    2L,
                    "Cristina",
                    "cristina.piele@gmail.com",
                    LocalDate.of(1995, Month.JUNE,3)
            );

            repository.saveAll(
                    List.of(cornel,cristina)
            );
        };
    }
}
