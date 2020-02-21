package io.zipcoder;

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


    public void removeStudent(String firstName, String lastName) {
        for (int i = 0; i < students.length; i++) {
            if(students[i].getFirstName().equals(firstName) && students[i].getLastName().equals(lastName)){
                students[i] = null;
            }

        }
        for (int i = 1; i < students.length; i++) {
            if(students[i-1] == null){
                students[i-1] = students[i];
                students[i] = null;
            }
        }
    }


    public Student[] getStudentsByScore(){
        Student[] result = students;
        for (int i = 1; i < result.length; i++) {
            if(result[i-1].getAverageExamScore() < result[i].getAverageExamScore()){
                Student tempPos = result[i-1];
                result[i-1] = result[i];
                result[i] = tempPos;
            } else if (result[i-1].getAverageExamScore() == result[i].getAverageExamScore()){
                String lastNamePrevStudent = result[i-1].getLastName();
                String lastNameCurrentStudent = result[i].getLastName();
                for (int j = 0; j < lastNameCurrentStudent.length(); j++) {
                    if(lastNamePrevStudent.charAt(j) > lastNameCurrentStudent.charAt(j)){
                        Student tempPos = result[i-1];
                        result[i-1] = result[i];
                        result[i] = tempPos;
                        break;
                    }
                }

            }
        }
        return result;
    }
}
