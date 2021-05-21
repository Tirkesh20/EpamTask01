package com.task1.task05;
import com.task1.properties.Scanners;

public class Task5 {
    /*
    Составить программу, печатающую значение true, если указанное высказывание является истинным, и
    false — в противном случае: является ли целое число совершенным (сумма делителей равна самому
    числу).
     */

    public static boolean isPerfect(){
        int n;
        n=Scanners.intScanner();
        int sum=0;
        for (int i=1;i<=n;i++){
            if (n%i==0)sum+=i;
        }
        return sum == n;
    }
}
