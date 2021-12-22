package by.epam.task1.task07;

import by.epam.task1.exception.NullPointerException;

public interface ClosestPointService {
    double minDist(Point point,Point center);
    Point findClosestPoint(Point center,Point pointA, Point pointB) throws NullPointerException;
}
