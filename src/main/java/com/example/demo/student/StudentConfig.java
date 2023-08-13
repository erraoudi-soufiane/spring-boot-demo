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
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student soufiane = new Student(
                    "soufiane",
                    "erraoudisoufiane5@gmail.com",
                    LocalDate.of(2002, Month.JUNE, 24),
                    21
            );
            Student mariam = new Student(
                    "mariam",
                    "mariam@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 24),
                    21
            );

            repository.saveAll(List.of(soufiane,mariam));
        };
    }
}
