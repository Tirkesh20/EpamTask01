package by.epam.task1.validator;public class Validator {
    public boolean validateRadius(double r){
        return  r<=0;
    }

    public boolean validateObject(Object o){
        return o==null;
    }

    public boolean lessOrEqualThanZero(double d){
        return  d<=0;
    }
}
