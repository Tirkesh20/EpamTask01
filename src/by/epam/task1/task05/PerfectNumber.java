package by.epam.task1.task05;
import by.epam.task1.properties.Scanners;

public class PerfectNumber implements PerfectNumberService {

    public  boolean isPerfect(int n){
        int sum=0;
        for (int i=1;i<=n;i++){
            if (n%i==0)
                sum+=i;
        }
        return sum == n;
    }
}
