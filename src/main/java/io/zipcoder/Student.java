package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    String firstName;
    String lastName;
    ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<Double> (Arrays.asList(testScores));
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumberOfExamsTaken() {
        return examScores.size();
    }

    public String getExamScores() {
        int examNumber = 1;
        StringBuilder result = new StringBuilder("\n");
        for (Double n : examScores) {
            result.append("Exam " + examNumber + " -> ");
            double castDouble = n;
            int currentScore = (int) castDouble;
            result.append(currentScore);
            result.append("\n");
            examNumber++;
        }
        return result.toString();
    }


    public void addExamScore(double v) {
    }
}
