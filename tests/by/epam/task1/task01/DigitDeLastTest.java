package by.epam.task1.task01;

import org.junit.Test;

import static org.junit.Assert.*;

public class DigitDeLastTest {

    DigitDeLast digitDeLast=new DigitDeLast();
    @Test
    public void whenNumberIsZero() {
        int expected=0;
        int number=0;
        test(expected,number);
    }

    @Test
    public void whenNumberIsPositive() {
        int expected=4;
        int number=12;
        test(expected,number);
    }

    public void whenNumberIsNegative(){
        int expected=4;
        int number=-12;
        test(expected,number);
    }



    private void test(int expected, int number) {
        int actual = digitDeLast.getDigitDeLastOfSquare(number);
        assertEquals(expected, actual);
    }




}