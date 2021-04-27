package com.example;

import java.time.LocalDate;

public class Student {
    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
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

    private String nameSurname;
    private LocalDate birthday;
    private char schoolClass;
    private int grade1 = 0;
    private int grade2 = 0;
    private int grade3 = 0;
    private int grade4 = 0;
    private boolean passedMaturita = false;


    public void checkIfPassedMaturita(){
        if (grade1 == 5 || grade2 == 5 || grade3 == 5 || grade4 == 5) {
            setPassedMaturita(false);
        }else setPassedMaturita(true);
    }

    public void passedWithDistinction(){
        int gradeTotal = grade1 + grade2 + grade3 + grade4;
        float average   = gradeTotal/4;
        if (passedMaturita && average <= 1.4) {
            System.out.println(nameSurname + " passed Maturita with deistinction! Congrats!");
        }
        else if (passedMaturita) {
            System.out.println(nameSurname + " passed Maturita!");
        }
        else System.out.println(nameSurname + " didn´t pass Maturita!");
    }

    public boolean isMaturitaOver() {
        if (grade1 == 0 || grade2 == 0 || grade3 == 0 || grade4 == 0) {
            System.out.println("The exam is still in progress");
            return false;
        }else System.out.print("The exam is complete with this result: ");
        return true;
    }
}