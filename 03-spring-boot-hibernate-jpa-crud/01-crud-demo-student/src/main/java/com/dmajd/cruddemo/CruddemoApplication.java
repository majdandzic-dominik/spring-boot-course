package com.dmajd.cruddemo;

import com.dmajd.cruddemo.dao.StudentDAO;
import com.dmajd.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

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

            // readStudent(studentDAO);

            // queryForStudents(studentDAO);

            // queryForStudentsByLastName(studentDAO);

            // updateStudent(studentDAO);

            // deleteStudent(studentDAO);

            // deleteAllStudents(studentDAO);
        };
    }

    private void deleteAllStudents(StudentDAO studentDAO)
    {
        int numOfDeletedStudents = studentDAO.deleteAll();
        System.out.println("Number of deleted students: " + numOfDeletedStudents);
    }

    private void deleteStudent(StudentDAO studentDAO)
    {
        int studentId = 3;
        System.out.println("Deleting student with id: "+ studentId);
        studentDAO.delete(studentId);
    }

    private void updateStudent(StudentDAO studentDAO)
    {
        // retrieve student
        int studentId = 1;
        System.out.println("Getting student with id: " + studentId);
        Student myStudent = studentDAO.findById(studentId);

        // change first name
        System.out.println("Updating student...");
        myStudent.setFirstName("Scooby");

        // update
        studentDAO.update(myStudent);

        // display change
        System.out.println(myStudent);
    }

    private void queryForStudentsByLastName(StudentDAO studentDAO)
    {
        // get a list of student
        List<Student> theStudents = studentDAO.findByLastName("Doe");

        // display list
        for (Student tempStudent : theStudents)
        {
            System.out.println(tempStudent);
        }
    }

    private void queryForStudents(StudentDAO studentDAO)
    {
        // get a list of student
        List<Student> theStudents = studentDAO.findAll();

        // display list
        for (Student tempStudent : theStudents)
        {
            System.out.println(tempStudent);
        }
    }

    private void readStudent(StudentDAO studentDAO)
    {
        // create the student object
        System.out.println("Creating new student object...");
        Student tempStudent = new Student("John", "Doe", "john@mail.com");

        // save the student object
        System.out.println("Saving the student...");
        studentDAO.save(tempStudent);

        // display id of the saved student
        int theId = tempStudent.getId();
        System.out.println("Saved student generated id: " + theId);

        // retrieve student based on the id
        System.out.println("Retrieving new with id: " + theId);
        Student myStudent = studentDAO.findById(theId);

        // display student
        System.out.println("Found student: " + myStudent);
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
        Student tempStudent = new Student("John", "Boe", "john@mail.com");

        // save the student object
        System.out.println("Saving the student...");
        studentDAO.save(tempStudent);

        // display id of the saved student
        System.out.println("Saved student generated id: " + tempStudent.getId());
    }

}
