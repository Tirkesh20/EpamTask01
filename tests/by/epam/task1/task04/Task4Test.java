package by.epam.task1.task04;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task4Test {
    EvenNumber evenNumberService=new EvenNumber();

    @Test
    public void numbersAreEven() {
        int[] evenNumbers = {2, 8, 4, 0, 2};
        testCheckEvenNumbers(true, evenNumbers, 2);
    }

    @Test
    public void numbersAreOdd() {
        int[] oddNumber = {1, 5, 3};
        testCheckEvenNumbers(false, oddNumber, 3);
    }

    private void testCheckEvenNumbers(boolean expected, int[] numbers, int evenNumberCount) {
        boolean actual = evenNumberService.result(numbers, evenNumberCount);
        assertEquals(expected, actual);
    }

}