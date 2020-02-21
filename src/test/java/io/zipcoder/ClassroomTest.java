package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClassroomTest {

    Logger logger = Logger.getLogger("ClassroomTest");


    @Test
    public void getAverageExamTest(){
        // : Given
        Double[] s1Scores = { 100.0, 150.0 };
        Double[] s2Scores = { 225.0, 25.0 };

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = new Student[]{s1,s2};
        Classroom classroom = new Classroom(students);

        // When
        double expected = 125.0;
        double actual = classroom.getAverageExamScore();

        // Then

        Assert.assertEquals(expected,actual,.00);
        logger.log(Level.INFO,"The average exam scores for the class = " + actual);

    }

    @Test
    public void addStudentTest(){
        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student s1 = new Student("Kevin", "Romero", examScores);

        // When
        Student[] preEnrollment = classroom.getStudents();
        String preEnrollmentAsString = Arrays.toString(preEnrollment);

        classroom.add(s1);
        Student[] postEnrollment = classroom.getStudents();
        String postEnrollmentAsString = Arrays.toString(postEnrollment);

        // Then
        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);

    }

    @Test
    public void removeStudentTest(){
        // : Given
        Double[] s1Scores = { 100.0, 150.0 };
        Double[] s2Scores = { 225.0, 25.0 };
        Double[] s3Scores = {95.0, 100.0};

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);
        Student s3 = new Student("student", "three", s3Scores);

        Student[] students = new Student[]{s1,s2,s3};
        Classroom classroom = new Classroom(students);

        // When
        Student[] preRemoval = classroom.getStudents();
        String preRemovalAsString = Arrays.toString(preRemoval);




        classroom.removeStudent("student", "one");
        Student[] postRemoval = classroom.getStudents();
        String postEnrollmentAsString = Arrays.toString(postRemoval);

        // Then
        logger.log(Level.INFO,"The old classroom = \n" + preRemovalAsString);
        logger.log(Level.INFO,"The new classroom = \n" + postEnrollmentAsString);

    }

    @Test
    public void getStudentsByScoreTest(){
        // : Given
        Double[] s1Scores = { 86.0, 150.0 };
        Double[] s2Scores = { 225.0, 25.0 };
        Double[] s3Scores = {225.0, 25.0, };

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);
        Student s3 = new Student("student", "three", s3Scores);

        Student[] students = new Student[]{s1,s2,s3};
        Classroom classroom = new Classroom(students);

        // : When
        Student[] postOrdered = classroom.getStudentsByScore();
        String postOrderedAsString = Arrays.toString(postOrdered);

        // : Then
        logger.log(Level.INFO,"The new classroom = \n" + postOrderedAsString);
    }
}
