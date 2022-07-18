package com.generation.service;

import com.generation.model.Student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    StudentService studentService;

    @BeforeEach
    void setUp() {
        studentService = new StudentService();
        studentService.subscribeStudent(new Student("100", "Harry Potter", "harrypotter@mail.com", new Date(1900, 9, 9)));
        studentService.subscribeStudent(new Student("101", "Ron Weasley", "ronweasley@mail.com", new Date(1900, 10, 10)));
    }


    @Test
    void findStudent() {
        // check that this student exists, should work since they're in BeforeEach
        assertEquals("100", studentService.findStudent("100").getId());
    }

    @Test
    void findStudentNotFound() {
        // check that this student doesn't exist
        assertNull(studentService.findStudent("1236"));
    }

}