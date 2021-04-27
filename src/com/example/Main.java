package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Student student1 = new Student();

        System.out.println("Welcome to Maturita result app! Now you will be asked to type student´s name and surname and his grades. If one or more exams haven´t been completed yet, please enter grade 0.");
        System.out.print("Enter student´s name and surname: ");
        student1.setNameSurname(in.nextLine());
        System.out.print("Enter student´s first grade: ");
        student1.setGrade1(in.nextInt());
        System.out.print("Enter student´s second grade: ");
        student1.setGrade2(in.nextInt());
        System.out.print("Enter student´s third grade: ");
        student1.setGrade3(in.nextInt());
        System.out.print("Enter student´s fourth grade: ");
        student1.setGrade4(in.nextInt());

        if (student1.isMaturitaOver()) {
            student1.checkIfPassedMaturita();
            student1.passedWithDistinction();
        }




    }
}
