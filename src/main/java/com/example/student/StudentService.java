package com.example.student;

import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Matome",
                        "matome@gmail.com",
                        LocalDate.of(1996, 11, 26),
                        25
                )
        );
    }
}
