package by.epam.task1.task09;

import by.epam.task1.properties.Scanners;
import by.epam.task1.validator.Validator;

/*
    Вычислить длину окружности и площадь круга одного и того же заданного радиуса R
 */
    public class Circle {

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
