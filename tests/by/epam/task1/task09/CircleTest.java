package by.epam.task1.task09;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    Circle circle=new Circle();

    @Test
    public void testFindCircleArea_IfRadiusLessOrEqualsThanZero() {
        double expected = -1;
        double radius = 0;
        testCalculateCircleArea(expected, radius);
    }

    @Test
    public void testCalculateCircleArea() {
        double expected = 3.14;
        double radius = 1;
        testCalculateCircleArea(expected, radius);
    }

    private void testCalculateCircleArea(double expected, double radius) {
        double actual = circle.findArea(radius);
        assertEquals(expected, actual, 0.01d);
    }

    @Test
    public void testCalculateCircumference_whenRadiusLessOrEqualsThanZero() {
        double expected = -1;
        double radius = 0;
        testCalculateCircumference(expected, radius);
    }

    @Test
    public void testCalculateCircumference() {
        double expected = 3.14;
        double radius = 0.5;
        testCalculateCircumference(expected, radius);
    }

    private void testCalculateCircumference(double expected, double radius) {
        double actual = circle.findCircumference(radius);
        assertEquals(expected, actual, 0.01d);
    }

}