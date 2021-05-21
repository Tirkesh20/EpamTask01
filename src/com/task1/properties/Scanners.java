package com.task1.properties;

import java.util.Scanner;

public class Scanners {
    private static final Scanner scanner = new Scanner(System.in);

    public static int intScanner() {
        while (!scanner.hasNext()){
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static double doubleScanner(){
        while (!scanner.hasNext()){
        scanner.next();
         }
        return scanner.nextDouble();
    }

}
