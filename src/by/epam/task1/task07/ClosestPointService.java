package by.epam.task1.task07;


import by.epam.task1.exception.NullPointerException;
import by.epam.task1.properties.Scanners;
import by.epam.task1.validator.Validator;

public class ClosestPointService {
    /*
    Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится
    ближе к началу координат. x y.
     */
    /**
     *
     *Euclid formula of distance between 2 objects d=sqrt(pow(x1-x2,2)+pow(y1-y2,2))
     */

private final Validator validator=new Validator();

    public   double minDist(Point point,Point center){
        if (!validator.validateObject(point)||!validator.validateObject(center)) {
            return Math.sqrt(Math.pow(center.getX() - point.getX(), 2) + (Math.pow(center.getY() - point.getY(), 2)));
        }
        return -1;
    }

    public   Point findClosestPoint(Point center,Point pointA, Point pointB) throws NullPointerException {
        if (!validator.validateObject(center) || !validator.validateObject(pointA) || !validator.validateObject(pointB)) {
            double p1 = minDist(pointA, center);
            double p2 = minDist(pointB, center);
            if (!(p1 == p2)) {
                if (p1 < p2) {
                    return pointA;
                } else {
                    return pointB;
                }
            }
            return null;
        }
        throw new NullPointerException();
    }
}
