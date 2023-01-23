package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

import java.util.Objects;

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public String getName(){
        return name;
    }

    public int getStudentId(){
        return studentId;
    }

    public int getNumberOfCredits(){
        return numberOfCredits;
    }

    public Double getGpa(){
        return gpa;
    }

    public void setName(String _name){
        name = _name;
    }

    protected void setStudentId(int _studentId){
        studentId = _studentId;
    }


    public void setNumberOfCredits(int _numberOfCredits){
        numberOfCredits = _numberOfCredits;
    }

    public void setGpa(Double _gpa){
        gpa = _gpa;
    }

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        double total = (grade * courseCredits) + (gpa * numberOfCredits);
        int totalCredits = numberOfCredits + courseCredits;
        double newGpa = total / totalCredits;
        gpa = newGpa;
        numberOfCredits = totalCredits;
    }

    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        if(numberOfCredits < 30){
            return "Freshman";
        } else if (numberOfCredits < 60){
            return "Sophomore";
        } else if (numberOfCredits < 90) {
            return "Junior";
        } else {
            return "Senior";
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", numberOfCredits=" + numberOfCredits +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }
}