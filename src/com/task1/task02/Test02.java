package com.task1.task02;

public class Test02 {
    public static void main(String[] args) {
        int validYear = Task2.validationOfYear();
        int validMonth = Task2.validationOfMonth();
        System.out.println(Task2.isLeap(validYear)? "Leap year" : "!Leap year");
        System.out.println("Number of days in month: " + Task2.daysInMonth(validMonth, validYear));
    }
}
