package com.dmajd.cruddemo;

import com.dmajd.cruddemo.dao.StudentDAO;
import com.dmajd.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(CruddemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO)
    {
        return runner ->
        {
            // createStudent(studentDAO);

            createMultipleStudents(studentDAO);
        };
    }

    private void createMultipleStudents(StudentDAO studentDAO)
    {
        // create multiple students
        System.out.println("Creating 3 student object...");
        Student tempStudent1 = new Student("One", "Doe", "one@mail.com");
        Student tempStudent2 = new Student("Two", "Doe", "two@mail.com");
        Student tempStudent3 = new Student("Three", "Doe", "three@mail.com");
        // save the student objects
        System.out.println("Saving the student...");
        studentDAO.save(tempStudent1);
        studentDAO.save(tempStudent2);
        studentDAO.save(tempStudent3);

    }

    private void createStudent(StudentDAO studentDAO)
    {
        // create the student object
        System.out.println("Creating new student object...");
        Student tempStudent = new Student("John", "Doe", "john@mail.com");

        // save the student object
        System.out.println("Saving the student...");
        studentDAO.save(tempStudent);

        // display id of the saved student
        System.out.println("Saved student generated id: " + tempStudent.getId());
    }

}
