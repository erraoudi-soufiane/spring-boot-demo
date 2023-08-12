package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    public List<Student> getStudents() {
        return List.of(new Student(1L,
                "soufiane",
                "erraoudisoufiane5@gmail.com",
                LocalDate.of(2002, Month.JUNE, 24),
                21));
    }
}
