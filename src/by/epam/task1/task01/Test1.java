package by.epam.task1.task01;

import by.epam.task1.properties.Scanners;

public class Test1 {

    public static void main(String[] args) {
        int num;
        System.out.println("Enter u r number");
        num = Scanners.intScanner();
        int lastDigitOfNum=DigitDeLast.getLastDigit(num);
        System.out.println("answer:"+DigitDeLast.getDigitDeLastOfSquare(lastDigitOfNum));
    }
}
