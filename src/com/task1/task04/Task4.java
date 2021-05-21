package com.task1.task04;

import com.task1.properties.Scanners;

import java.util.InputMismatchException;


public class Task4 {
    public static double[] readingArray() {
        while (true) {
            System.out.println("Enter values:");
            try {
                double[] array = new double[4];
                for (int i = 0; i < 4; i++) {
                    array[i] = Scanners.doubleScanner();
                }
                return array;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect input");
            }
        }
    }

    public static boolean result(double[] arr){
        int counter = 0;
        for (int i = 0; i < 4; i++){
            if(arr[i] % 2 == 0){
                counter++;
            }
        }
        return counter > 1;
    }

}
