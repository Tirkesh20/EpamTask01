package by.epam.task1.task03;

import org.junit.Test;

import static org.junit.Assert.*;

public class task3Test {

    SquareArea squareArea=new SquareArea();
    @Test
    public void testCalculateInsideSquareArea_whenOutsideSquareAreaLessThenZero() {
        double expected = -1;
        double outsideSquareArea = -1;
        testCalculateInsideSquareArea(expected, outsideSquareArea);
    }

    @Test
    public void testCalculateInsideSquareArea_whenAreaEqualsZero() {
        double expected = -1;
        double outsideSquareArea = 0;
        testCalculateInsideSquareArea(expected, outsideSquareArea);
    }

    @Test
    public void testCalculateInsideSquareArea_whenAreaEqualsEight() {
        double expected = 2;
        double outsideSquareArea = 8;
        testCalculateInsideSquareArea(expected, outsideSquareArea);
    }

    private void testCalculateInsideSquareArea(double expected, double outsideSquareArea) {
        double actual = squareArea.SecondSqrR(outsideSquareArea);
        assertEquals(expected, actual, 0.01d);
    }

    @Test
    public void testCalculateDivide_whenInsideSquareAreaLessThenZero() {
        int expected = -1;
        double insideSquareArea = -1;
        double outsideSquareArea = 1;
        testCalculateDivide(expected, insideSquareArea, outsideSquareArea);
    }

    @Test
    public void testCalculateDivide_whenInsideSquareAreaEqualsZero() {
        int expected = -1;
        double insideSquareArea = 0;
        double outsideSquareArea = 1;
        testCalculateDivide(expected, insideSquareArea, outsideSquareArea);
    }

    @Test
    public void testCalculateDivide_whenOutsideSquareAreaLessThenZero() {
        int expected = -1;
        double insideSquareArea = 1;
        double outsideSquareArea = -1;
        testCalculateDivide(expected, insideSquareArea, outsideSquareArea);
    }

    @Test
    public void testCalculateDivide_whenOutsideSquareAreaEqualsZero() {
        int expected = -1;
        double insideSquareArea = 1;
        double outsideSquareArea = 0;
        testCalculateDivide(expected, insideSquareArea, outsideSquareArea);
    }

    private void testCalculateDivide(int expected,
                                     double insideSquareArea,
                                     double outsideSquareArea) {

        int actual =  squareArea.ratioOfSquares(insideSquareArea, outsideSquareArea);
        assertEquals(expected, actual);
    }
}