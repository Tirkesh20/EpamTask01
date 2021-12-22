package by.epam.task1.task06;

    /*
    Идет n-я секунда суток, определить, сколько полных часов, полных минут и секунд прошло к этому
    моменту
     */
public class TimeCalculator implements TimeService {

    final  int secondsInMinute = 60;
    final  int minutesInHour = 60;

    public  int currentTimeMin(int seconds) {
        int hours=findHoursPassed(seconds);
        int minutes=findMinutesPassed(seconds);
        return minutes - hours * minutesInHour;
    }

    public  int currentTimeSec(int totalSecs) {
        int hoursPassed=findHoursPassed(totalSecs);
        int currentMin=currentTimeMin(totalSecs);
        return totalSecs - hoursPassed * minutesInHour * secondsInMinute - currentMin * secondsInMinute;
    }

    public  int findMinutesPassed(int seconds){
        return seconds/secondsInMinute;
    }

    public  int findHoursPassed(int seconds){
        return seconds/(minutesInHour*secondsInMinute);
    }
}
