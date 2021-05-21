package com.task1.task01;
/*
 Solution for task-1
  */
public class DigitDeLast {

    private static final int N=10; //N - Base number of System
    private static final int power=2;//defined power

    public static int getLastDigit(int num){
    if (num < 0)return num;
         return num%N;
    }

    public static int getDigitDeLastOfSquare(int num){
     return getLastDigit((int) Math.pow(num,power));
    }
}
