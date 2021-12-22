package by.epam.task1.task09;

import by.epam.task1.validator.Validator;

public class Circle implements CircleService {

    private final   Validator validator=new Validator();

    public  double findArea(double r){
        if (!validator.validateRadius(r)){
            return Math.PI*Math.pow(r,2);
        }
        return -1;
    }

    public  double findCircumference(double r){
        if (!validator.validateRadius(r)) {
            return 2*Math.PI*r;
        }
        return -1;
    }

}
