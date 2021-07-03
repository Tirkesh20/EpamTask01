package by.epam.task1.task08;

import by.epam.task1.properties.Scanners;

public class Task8 {

    public static int  FindFx(int x){
        return  (x<3) ? ifXSmaller(x) : ifXBigger(x);
    }

    public static int ifXBigger(int x){
        return (int) Math.pow(-x,2)+3*x+9;
    }

    public static int ifXSmaller(int x){
        return 1/(int) Math.pow(x,3)-6;
    }
}
