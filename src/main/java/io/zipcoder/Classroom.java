package io.zipcoder;

import sun.java2d.DisposerTarget;

public class Classroom {
    Student[] students;
    private int maxNumberOfStudents;

    public Classroom() {
        this.students = new Student[30];
    }

    public Classroom(int maxNumber) {
        this.students = new Student[maxNumber];
    }

    public Classroom(Student[] students) {
        this.students = students;
    }


    public Student[] getStudents() {
        return students;
    }

    public double getAverageExamScore() {
        double result = 0.0;
        int numberOfStudents = students.length;
        for (Student n : students) {
           result += n.getAverageExamScore();
        }
        return result/numberOfStudents;
    }


    public void add(Student sN) {
        for (int i = 0; i < students.length; i++) {
            students[i] = sN;
        }
    }
}
