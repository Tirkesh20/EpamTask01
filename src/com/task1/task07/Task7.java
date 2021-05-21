package com.task1.task07;


import com.task1.properties.Scanners;

public class Task7 {
    /*
    Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится
    ближе к началу координат. x y.
     */
    /**
     *
     *Euclid formula of distance between 2 objects d=sqrt(pow(x1-x2,2)+pow(y1-y2,2))
     */
    public static void findClosest() {
        Point center=new Point("Center");//начало координат
        Point pointA = new Point("A");
        Point pointB = new Point("B");
        setCoordinates(center);
        setCoordinates(pointA);
        setCoordinates(pointB);

            Point point=findClosestPoint(pointA,pointB,center);
            if (point != null) {
                System.out.println(point.getPointName());
            } else {
                System.out.println("objects  have same distance");
            }
    }

    public static void setCoordinates(Point point){
        System.out.println("enter coordinates for point"+" "+point.getPointName());
        System.out.println("enter x");
        point.setX(Scanners.doubleScanner());
        System.out.println("enter y");
        point.setY(Scanners.doubleScanner());
    }

    public static  double minDist(Point point,Point center){
        return  Math.sqrt(Math.pow(center.getX()- point.getX(),2)+ (Math.pow(center.getY()- point.getY(),2)));
    }

    private static Point findClosestPoint(Point pointA, Point pointB,Point center) {
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
}
