package com.company.task01;
/*
 Solution for task-1
  */
public class DigitDeLast {
    /**
     * N - Base number of System
     */
    private static final int N=10;

    /**
     * @param num
     * @return last digit of integer number
     */
    public static int getLastDigit(int num){
    if (num < 0)return num;
         return num%N;
    }
    /**
     * @param num
     * @return
     */
    public static int getDigitDeLastOfSquare(int num){
     return getLastDigit((int) Math.pow(num,2));
    }

}
