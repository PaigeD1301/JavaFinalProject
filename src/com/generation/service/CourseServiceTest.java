package com.generation.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseServiceTest {
    CourseService courseService;

    @BeforeEach
    void setUp() {
        courseService = new CourseService();
    }

    @Test
    void getCourse() {
        assertEquals(9, courseService.getCourse("INTRO-CS-1").getCredits());
    }

    @Test
    void getCourseNotFound() {
        assertNull(courseService.getCourse("INTRO-CS-9"));
    }
}