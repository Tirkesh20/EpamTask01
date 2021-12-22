package by.epam.task1.task07;

import by.epam.task1.exception.NullPointerException;
import org.junit.Test;

import static org.junit.Assert.*;

public class DefaultClosestPointServiceTest {

    private  final ClosestPointService closestPointService=new DefaultClosestPointService();

    Point center = new Point(1, 3);
    Point point1 = new Point(7, 5);
    Point point2 = new Point(3, 4);
    Point point3 = new Point(3, 4);

    @Test(expected = NullPointerException.class)
    public void testDefineClosestPoint_whenPointIsNull()  {
        closestPointService.minDist(null, center);
    }

    @Test
    public void testPoint2IsClosest() throws NullPointerException {
        testDefineClosestPoint(point2,center, point1, point2);
    }

    @Test
    public void testDefineClosestPoint_whenPointsAreEqualised() throws NullPointerException {
        testDefineClosestPoint(null,center, point2, point3);
    }

    private void testDefineClosestPoint(Point expected,Point center, Point point1, Point point2) throws  NullPointerException {
        Point actual = closestPointService.findClosestPoint(center, point1, point2);
        assertEquals(expected, actual);
    }

}