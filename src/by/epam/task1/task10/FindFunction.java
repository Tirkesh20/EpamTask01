package by.epam.task1.task10;
import by.epam.task1.exception.IllegalArgumentException;
import by.epam.task1.exception.IndexException;
import by.epam.task1.validator.Validator;

import java.util.LinkedHashMap;
import java.util.Map;

/*
     Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
    представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
    значения функции:F(x)=tg(x)
    */
public class FindFunction {

    Validator validator=new Validator();

        public Map<double, double> function(double a, double b, double h) throws IndexException, IllegalArgumentException {
                if (b <= a) {
                    throw new IndexException();
                }
                if (validator.lessOrEqualThanZero(h)){
                    throw new IllegalArgumentException("step is smaller than 0");
                }

            return makeTable(a,b,h);
        }

        public  Map<double,double> makeTable(double a,double b,double h){
            Map<double,double> table=new LinkedHashMap<double, double>();
            double x=a;
            while (x<b){
               table.put(x,Math.tan(x)) ;
                x+=h;
            }
            return table;
        }

}
