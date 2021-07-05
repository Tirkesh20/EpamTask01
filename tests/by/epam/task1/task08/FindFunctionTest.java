package by.epam.task1.task08;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindFunctionTest {

    FindFunction findFunction=new FindFunction();
    @Test
    public void testIfNumberBiggerThanThree() {
        double expected = 9;
        test(expected, 3);
    }

    @Test
    public void testIfNumberLessThenThree() {
        double expected = -0.2;
        test(expected, 1);
    }

    private void test(double expected, double number) {
        double actual = findFunction.FindFx(number);
        assertEquals(expected, actual, 0.01d);
    }
}