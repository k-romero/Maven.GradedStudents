package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentTest {

     Logger logger = Logger.getLogger("Dice");

    @Test
    public void getExamScoresTest(){
        //Given
        String firstName = "Kevin";
        String lastName = "Romero";
        Double[] examScores = {100.0, 95.0, 98.0, 75.0};
        Student testStudent = new Student(firstName,lastName,examScores);

        //When
        String output = testStudent.getExamScores();

        //Then
        logger.log(Level.INFO,"This students record = " + output);

    }

    @Test
    public void addExamScoreTest(){
        //Given
        String firstName = "Kevin";
        String lastName = "Romero";
        Double[] examScores = {};
        Student testStudent = new Student(firstName,lastName,examScores);

        //When
        testStudent.addExamScore(100.0);
        String output = testStudent.getExamScores();


        int expected = 1;
        int actual = testStudent.examScores.size();
        //Then
        logger.log(Level.INFO,"This students record = " + output);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setExamScoreTest(){
        //Given
        String firstName = "Kevin";
        String lastName = "Romero";
        Double[] examScores = {100.0};
        Student testStudent = new Student(firstName,lastName,examScores);

        //When
        testStudent.setExamScore(1, 150.0);
        String output = testStudent.getExamScores();


        double expected = 150.0;
        double actual = testStudent.examScores.get(0);

        //Then
        logger.log(Level.INFO,"This students record = " + output);
        Assert.assertEquals(expected, actual, .00);
    }

    @Test
    public void getAvgExamScoreTest(){
        //Given
        String firstName = "Kevin";
        String lastName = "Romero";
        Double[] examScores = {100.0, 95.0, 99.0, 88.0};
        Student testStudent = new Student(firstName,lastName,examScores);

        //When
        double expected = 95.5;
        double actual = testStudent.getAverageExamScore();
        String output = testStudent.getExamScores();


        //Then
        logger.log(Level.INFO,"This students record = " + output);
        Assert.assertEquals(expected, actual, .00);
    }

}