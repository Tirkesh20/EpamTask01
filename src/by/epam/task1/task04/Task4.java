package by.epam.task1.task04;

import by.epam.task1.properties.Scanners;
import java.util.InputMismatchException;


public class Task4 {

    public static double[] readingArray() {
        System.out.println("enter counts of numbers");
        int n=Scanners.intScanner();
        while (true) {
            System.out.println("Enter values:");
            try {
                double[] array = new double[n];
                for (int i = 0; i < n; i++) {
                    array[i] = Scanners.positiveDouble();
                }
                return array;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect input");
            }
        }
    }

    public static boolean result(double[] arr,int n){
        int counter = 0;
        for (int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                counter++;
            }
        }
        return counter > 1;
    }

}
