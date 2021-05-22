package by.epam.task1.task02;

import by.epam.task1.properties.Scanners;

import java.util.InputMismatchException;


public class Task2 {


    public static int validMonth() {
        int month;
        while (true) {
            System.out.println("Number of month:");
            month = Scanners.intScanner();
            if (!(month > 0 & month <= 12)) {
                System.out.println("incorrect input.");
            } else return month;
        }
    }
    public static int validYear() {
        int year = -1;//чтобы цикл сработал только 1 раз
        while (year < 0) {
            System.out.println("Enter year:");
                year = Scanners.intScanner();
            if (year < 0) {
                System.out.println("incorrect input");
            }
        }
        return year;
    }

    public static boolean isLeap(int year) {
        return ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));

    }

    public static int daysOfMonth(int validMonth, int validYear) {
        int[] days = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if(isLeap(validYear)){
            days[1] = 29;
            System.out.println( "Leap year");
        }
        System.out.println("not leap year");
        return days[validMonth-1];
    }

}
