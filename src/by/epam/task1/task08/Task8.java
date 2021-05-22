package by.epam.task1.task08;

import by.epam.task1.properties.Scanners;

public class Task8 {

    public static void FindFx(){
        System.out.println("enter x (integer)");
        int x = Scanners.intScanner();
        int Fx = (x<3) ? ifXSmaller(x) : ifXBigger(x);
        System.out.println(Fx);
    }

    public static int ifXBigger(int x){
        return (int) Math.pow(-x,2)+3*x+9;
    }

    public static int ifXSmaller(int x){
        return 1/(int) Math.pow(x,3)-6;
    }
}
