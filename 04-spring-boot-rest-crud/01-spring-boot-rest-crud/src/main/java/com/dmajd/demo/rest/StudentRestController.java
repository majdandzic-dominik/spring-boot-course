package com.dmajd.demo.rest;

import com.dmajd.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController
{
    // define endpoint for "/students" - return a list of students

    @GetMapping("/students")
    public List<Student> getStudents()
    {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Adam", "Adamovich"));
        students.add(new Student("Sam", "Samovich"));
        students.add(new Student("Ken", "Kenovich"));
        students.add(new Student("Lucy", "Lucyovich"));

        return students;
    }
}
