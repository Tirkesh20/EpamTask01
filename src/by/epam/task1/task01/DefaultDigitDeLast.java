package by.epam.task1.task01;
/*
 Solution for task-1
  */
public class DefaultDigitDeLast implements DigitDeLast {

    private static final int N=10; //N - Base number of System
    private static final int power=2;//defined power

    public  int getDigitDeLastOfSquare(int num){
        return (int) (Math.pow(num,power)%N);
    }
}
