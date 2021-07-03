package by.epam.task1.task02;


public class Task2 {
   public static int[] days = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public static boolean isLeap(int year) {
        return ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
    }

    public static int daysOfMonth(int month, int year) {
        if(isLeap(year)){
            days[1] = 29;
            System.out.println( "Leap year");
        }
        System.out.println("not leap year");
        return days[month-1];
    }

}
