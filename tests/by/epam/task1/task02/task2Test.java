package by.epam.task1.task02;

import org.junit.Test;

import static org.junit.Assert.*;

public class task2Test {

    private final CountDays daysCount=new DefaultDaysCount();

    @Test
    public void monthEqualsZero() {
        int expected = -1;
        int year = 0;
        int month = 0;
        test(expected, year, month);
    }
    @Test
    public void yearLessThenZero() {
        int expected = -1;
        int year = -1;
        int month = 1;
        test(expected, year, month);
    }

    @Test
    public void monthLessThenZero() {
        int expected = -1;
        int year = 0;
        int month = -1;
        test(expected, year, month);
    }

    @Test
    public void monthOverTwelve() {
        int expected = -1;
        int year = 0;
        int month = 13;
        test(expected, year, month);
    }

    @Test
    public void monthIsFebruaryAndYearIsNotLeap() {
        int expected = 28;
        int year = 0;
        int month = 2;
        test(expected, year, month);
    }

    @Test
    public void monthIsFebruaryAndYearIsLeap() {
        int expected = 29;
        int year = 4;
        int month = 2;
        test(expected, year, month);
    }

    private void test(int expected, int year, int month) {
        int actual = daysCount.daysOfMonth(year, month);
        assertEquals(expected, actual);
    }
}