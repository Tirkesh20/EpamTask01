package by.epam.task1.task02;


public class DefaultDaysCount implements CountDays {
   public  final int MIN_NUMBER=1;
   public  int MAX_NUMBER=12;
   public  int[] days = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public  boolean isLeap(int year) {
        return ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
    }

    public  int daysOfMonth(int month, int year) {

        if (year<=0||month<MIN_NUMBER||month>MAX_NUMBER){
            return -1;
        }
        if(isLeap(year)){
           return days[1] = 29;
        }

        return days[month];
    }

}
