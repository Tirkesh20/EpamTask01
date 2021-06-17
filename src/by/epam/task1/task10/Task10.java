package by.epam.task1.task10;
import by.epam.task1.properties.Scanners;

/*
     Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
    представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
    значения функции:F(x)=tg(x)
    */
public class Task10 {

        public static void function(double a,double b) {
            boolean flag = true;
            while (flag) {
                if (b <= a) {
                    System.out.println("a is bigger than b");
                    flag = true;
                } else flag = false;
            }
            System.out.println("enter h");
            double h=Scanners.doubleScanner();
            makeTable(a,b,h);
        }

        public static void makeTable(double a,double b,double h){
            System.out.println("|_______F(X)_______|______t(x)______|");
            double x=a;
            while (x<b){
                double y=Math.tan(x);
                System.out.format("|     %-4f     |      %-4f   |\n",x,y);
                x+=h;
            }
        }

}
