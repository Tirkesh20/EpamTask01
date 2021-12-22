package by.epam.task1.task06;

import org.junit.Test;

import static org.junit.Assert.*;

public class TimeCalculatorTest {
   private final TimeService time=new TimeCalculator();

    @Test
    public void testCalculatePastHours_whenSecondLessThenOne() {
        int expected = -1;
        int seconds = 0;
        testCalculatePastHours(expected, seconds);
    }

    @Test
    public void testCalculatePastHours_whenSecondOverMaxValue() {
        int expected = -1;
        int seconds = 900000;
        testCalculatePastHours(expected, seconds);
    }

    @Test
    public void testCalculatePastHours() {
        int expected = 2;
        int seconds = 9000;
        testCalculatePastHours(expected, seconds);
    }

    private void testCalculatePastHours(int expected, int seconds) {
        int actual = time.findMinutesPassed(seconds);
        assertEquals(expected, actual);
    }

    @Test
    public void testCalcRemainingSecondsAfterPastHours() {
        int expected = 5;
        int seconds = 3605;
        int actual = time.currentTimeSec(seconds);
        assertEquals(expected, actual);
    }

    @Test
    public void testCalculatePastMinutes() {
        int expected = 5;
        int seconds = 300;
        int actual = time.findMinutesPassed(seconds);
        assertEquals(expected, actual);
    }

    @Test
    public void testCalcRemainingSecondsAfterPastMinutes() {
        int expected = 5;
        int seconds = 65;
        int actual = time.currentTimeSec(seconds);
        assertEquals(expected, actual);
    }
}