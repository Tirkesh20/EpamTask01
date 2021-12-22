package by.epam.task1.task06;

public interface TimeService {

    /*
    Идет n-я секунда суток, определить, сколько полных часов, полных минут и секунд прошло к этому
    моменту
     */

    int currentTimeMin(int seconds);

    int currentTimeSec(int totalSecs);

    int findMinutesPassed(int seconds);

    int findHoursPassed(int seconds);
}
