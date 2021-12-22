package by.epam.task1.task05;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task5Test {
    private final PerfectNumberService perfectNumber=new PerfectNumber();

    @Test
    public void numberIsPerfect() {
        int perfectNumber = 6;
        testIsPerfect(true, perfectNumber);
    }

    @Test
    public void numberIsNotPerfect() {
        int notPerfectNumber = 7;
        testIsPerfect(false, notPerfectNumber);
    }

    private void testIsPerfect(boolean expected, int number) {
        boolean actual = perfectNumber.isPerfect(number);
        assertEquals(expected, actual);
    }

}