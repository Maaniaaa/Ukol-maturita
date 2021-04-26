package com.example;

import java.time.LocalDate;

public class Student {
    private String name;
    private String surname;
    private LocalDate birthday;
    private char schoolClass;
    private int grade1 = 0;
    private int grade2 = 0;
    private int grade3 = 0;
    private int grade4 = 0;
    private boolean passedMaturita = false;
        
        
    public void checkIfPassedMaturita(){

        int gradeTotal = grade1 + grade2 + grade3 + grade4;
        float average   = gradeTotal/4;
        if (grade1 == 5 || grade2 == 5 || grade3 == 5 || grade4 == 5) {
            setPassedMaturita(false);
        }else setPassedMaturita(true);
    }
        
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public char getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(char schoolClass) {
        this.schoolClass = schoolClass;
    }

    public int getGrade1() {
        return grade1;
    }

    public void setGrade1(int grade1) {
        this.grade1 = grade1;
    }

    public int getGrade2() {
        return grade2;
    }

    public void setGrade2(int grade2) {
        this.grade2 = grade2;
    }

    public int getGrade3() {
        return grade3;
    }

    public void setGrade3(int grade3) {
        this.grade3 = grade3;
    }

    public int getGrade4() {
        return grade4;
    }

    public void setGrade4(int grade4) {
        this.grade4 = grade4;
    }

    public boolean getPassedMaturita() {
        return passedMaturita;
    }

    public void setPassedMaturita(boolean passedMaturita) {
        this.passedMaturita = passedMaturita;
    }
}
