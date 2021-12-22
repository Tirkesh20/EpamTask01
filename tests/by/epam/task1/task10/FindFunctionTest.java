package by.epam.task1.task10;

import by.epam.task1.exception.IllegalArgumentException;
import by.epam.task1.exception.IndexException;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class FindFunctionTest {

    private  final FunctionService findFunction=new FindFunction();
    double start;
    double step;
    double end;

    @Test(expected = IndexException.class)
    public void testCalculateFunction_whenFirstIndexOverSecond() throws IndexException, IllegalArgumentException {
        start=10; end=4; step=2;
        findFunction.function(end, start, step);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateFunction_whenStepLessOfEqualsThanZero() throws IndexException, IllegalArgumentException {
        start=1;end=2;step=0;
        findFunction.function(start, end, end);
    }

    @Test
    public void testCalculateFunction() throws  IndexException, IllegalArgumentException {
        start=1;end=3;step=1;
        Map<double, double> expected = new LinkedHashMap<double,double>();
        expected.put(1.0, 1.5574077246549023);
        expected.put(2.0, -2.185039863261519);
        expected.put(3.0, -0.1425465430742778);
        Map<double, double> actual = findFunction.function(start,end,step);
        assertEquals(expected, actual);
    }

}