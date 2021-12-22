package by.epam.task1.task10;

import by.epam.task1.exception.IllegalArgumentException;
import by.epam.task1.exception.IndexException;

import java.util.Map;

    /*
     Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
    представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
    значения функции:F(x)=tg(x)
    */
public interface FunctionService {
    Map<double, double> function(double a, double b, double h) throws IndexException, IllegalArgumentException;
    Map<double,double> makeTable(double a,double b,double h);
}
