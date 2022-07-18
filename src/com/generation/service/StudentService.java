package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    }

    public Student findStudent( String studentId )
    {
        if ( students.containsKey( studentId ) )
        {
            return students.get( studentId );
        }
        return null;
    }

    public void showSummary() {
        //TODO implement
        System.out.println( "Student Summary" );
        students.forEach((key, value) -> {
            System.out.println("key " + key);
            System.out.println("Value " + value);
        });
//        for (String key : students.keySet()) {
//            Student student = students.get(key);
//            System.out.println(student);
//        }
    }

    public void enrollToCourse( String studentId, Course course )
    {
        if ( students.containsKey( studentId ) )
        {
            students.get( studentId ).enrollToCourse( course );
        }
    }


}
