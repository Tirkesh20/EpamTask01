package by.epam.task1.task07;

import by.epam.task1.properties.Scanners;

public class PointCreator {

    public Point createPoint() {
        Point point = new Point();
        point.setX(Scanners.doubleScanner());
        point.setY(Scanners.doubleScanner());
        return point;
    }
}
