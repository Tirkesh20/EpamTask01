package by.epam.task1.task05;
import by.epam.task1.properties.Scanners;

public class PerfectNumber {
    /*
    Составить программу, печатающую значение true, если указанное высказывание является истинным, и
    false — в противном случае: является ли целое число совершенным (сумма делителей равна самому
    числу).
     */

    public  boolean isPerfect(int n){
        int sum=0;
        for (int i=1;i<=n;i++){
            if (n%i==0)
                sum+=i;
        }
        return sum == n;
    }
}