package io.zipcoder;

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

        //Then
        logger.log(Level.INFO,"This students record = " + output);
    }

}