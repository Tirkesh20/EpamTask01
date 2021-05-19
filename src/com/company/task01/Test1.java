package com.company.task01;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        int num;
        System.out.println("Enter u r number");
        Scanner scanner=new Scanner(System.in);
        num=scanner.nextInt();
        int lastDigitOfNum=DigitDeLast.getLastDigit(num);
        System.out.println("answer:"+DigitDeLast.getDigitDeLastOfSquare(lastDigitOfNum));
    }
}
