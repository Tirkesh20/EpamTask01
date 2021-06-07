package by.epam.task1.task03;

import by.epam.task1.properties.Scanners;

public class Task3 {

    public  static double SecondSqrR(){
        double sqR= Scanners.doubleScanner();
        return (double)sqR/2;
    }

    public static int ratioOfSquares(){
        int firstSqr=Scanners.intScanner();
        double secondSqr=Scanners.doubleScanner();
        return ((int) (firstSqr/secondSqr));
    }

}