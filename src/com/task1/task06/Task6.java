package com.task1.task06;

import com.task1.properties.Scanners;
    /*
    Идет n-я секунда суток, определить, сколько полных часов, полных минут и секунд прошло к этому
    моменту
     */
public class Task6 {

    final static int secondsInMinute = 60;
    final static int minutesInHour = 60;

    public static void tellTimePassed(){
        int seconds,minPassed,hoursPassed,currentMin,currentSec;
        seconds= Scanners.intScanner();
        int totalSecs=seconds;
        hoursPassed=toHours(seconds);
        minPassed=toMinutes(seconds);
        currentMin=currentTimeMin(minPassed,hoursPassed);
        currentSec=currentTimeSec(totalSecs,hoursPassed,currentMin);
        System.out.printf("Hours passed: %d, min passed: %d, second passed: %d\n", hoursPassed, minPassed, totalSecs);
        System.out.println("Current time"+" "+hoursPassed+" "+currentMin+" "+currentSec);
    }


    public static int currentTimeMin(int minutes, int hours) {
        return minutes - hours * minutesInHour;
    }

    public static int currentTimeSec(int totalSecs, int hoursPassed, int currentMin) {
        return totalSecs - hoursPassed * minutesInHour * secondsInMinute - currentMin * secondsInMinute;
    }

    public static int toMinutes(int seconds){
        return seconds/secondsInMinute;
    }

    public static int toHours(int seconds){
        return seconds/(minutesInHour*secondsInMinute);
    }
}
