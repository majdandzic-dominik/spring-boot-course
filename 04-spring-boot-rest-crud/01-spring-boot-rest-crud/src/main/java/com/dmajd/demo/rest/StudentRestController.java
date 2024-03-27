package com.dmajd.demo.rest;

import com.dmajd.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController
{
    private List<Student> students;

    // define @PostConstruct to load the student data only once
    @PostConstruct
    public void loadData()
    {
        students = new ArrayList<>();

        students.add(new Student("Adam", "Adamovich"));
        students.add(new Student("Sam", "Samovich"));
        students.add(new Student("Ken", "Kenovich"));
        students.add(new Student("Lucy", "Lucyovich"));
    }

    // define endpoint for "/students" - return a list of students
    @GetMapping("/students")
    public List<Student> getStudents()
    {
        return students;
    }

    // define endpoint for "/students/{studentId}" - return student at index
    @GetMapping("students/{studentId}")
    public Student getStudentById(@PathVariable int studentId)
    {
        return students.get(studentId);
    }
}
