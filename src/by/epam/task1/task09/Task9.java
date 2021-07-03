package by.epam.task1.task09;

import by.epam.task1.properties.Scanners;

/*
    Вычислить длину окружности и площадь круга одного и того же заданного радиуса R
 */
    public class Task9 {

    public static void findSAndP(double r){
        double s = findArea(r);
        double p = findCircle(r);
        System.out.printf("Area=%a Circle=%a",s,p);
    }

    public static double findArea(double r){
        return Math.PI*Math.pow(r,2);
    }

    public static double findCircle(double r){
        return 2*Math.PI*r;
    }

}
