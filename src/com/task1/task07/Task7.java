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
        double baseX,baseY;//начало координат
        Point pointA = new Point("A");
        Point pointB = new Point("B");
        System.out.println("enter base x");
        baseX= Scanners.doubleScanner();
        System.out.println("enter base y");
        baseY=Scanners.doubleScanner();
        setCoordinates(pointA);
        setCoordinates(pointB);

            Point point=findClosestPoint(pointA,pointB,baseX,baseY);
            if (point != null) {
                System.out.println(point.getPointName());
            } else {
                System.out.println("objects  have same distance");
            }

    }
    public static void setCoordinates(Point point){
        System.out.println("enter coordinates for point"+point.getPointName());
        System.out.println("enter x");
        point.setX(Scanners.doubleScanner());
        System.out.println("enter y");
        point.setY(Scanners.doubleScanner());
    }

    public static  double minDist(Point point,double x1,double y1){
        return  Math.sqrt(Math.pow(x1- point.getX(),2)+(Math.pow(y1- point.getY(),2)));
    }

    private static Point findClosestPoint(Point pointA, Point pointB,double x,double y) {
        if (minDist(pointA,x,y)<((minDist(pointB,x,y)))){
            return pointA;
        } else if (minDist(pointA,x,y)>((minDist(pointA,x,y)))){
            return pointB;
        } else {
            return null;
        }
    }
}
