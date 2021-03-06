package by.epam.task1.task08;


public class FindFunction implements FunctionService{

    public  double  FindFx(double x){
        return  (x<3) ? ifXSmaller(x) : ifXBigger(x);
    }

    private   double ifXBigger(double x){
        return  Math.pow(-x,2)+3*x+9;
    }

    private   double ifXSmaller(double x){
        return 1/ Math.pow(x,3)-6;
    }
}
