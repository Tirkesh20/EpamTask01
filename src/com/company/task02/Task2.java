package com.company.task02;

import com.company.properties.Scanners;

import java.util.InputMismatchException;


public class Task2 {

    public static int validationOfYear() {
        int year = -1;
        while (year < 0) {
            System.out.println("Введите год:");
            try {
                year = Scanners.intScanner();
            }
            catch (InputMismatchException e){
                System.out.println("Некооректное значение.");
            }
            if (year < 0) {
                System.out.println("Некооректное значение.");
            }
        }
        return year;
    }

    public static int validationOfMonth() {
        int month;
        while (true) {
            System.out.println("Number of month:");
            month = Scanners.intScanner();
            if (!(month > 0 & month <= 12)) {
                System.out.println("incorrect input.");
            } else return month;
        }
    }

    public static boolean isLeap(int year) {
        return ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
    }

    public static int daysInMonth(int validMonth, int validYear) {
        int[] days = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if(isLeap(validYear)){
            days[1] = 29;
        }
        return days[validMonth-1];
    }


}
