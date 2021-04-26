package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Student student1 = new Student();

        System.out.print("Enter student´s first grade: ");
        student1.setGrade1(in.nextInt());
        System.out.print("Enter student´s second grade: ");
        student1.setGrade2(in.nextInt());
        System.out.print("Enter student´s third grade: ");
        student1.setGrade3(in.nextInt());
        System.out.print("Enter student´s fourth grade: ");
        student1.setGrade4(in.nextInt());

        student1.checkIfPassedMaturita();

        if (student1.getPassedMaturita() == true) {
            System.out.println("This student passed Maturita!");
        }else System.out.println("This student didn´t pass Maturita!");

    }
}
