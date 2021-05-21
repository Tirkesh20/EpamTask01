package com.task1.task07;

import java.util.Objects;

public class Point {
    private double x;
    private double y;
    private String pointName;

    public Point(){

    }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }
    public void setXY(double x,double y){
        this.x=x;
        this.y=y;
    }
    public void setY(double y) {
        this.y = y;
    }


    public Point(String name) {
        this.pointName=name;
    }

    public String getPointName() {
        return pointName;
    }

    public void setPointName(String pointName) {
        this.pointName = pointName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0 && Objects.equals(pointName, point.pointName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, pointName);
    }
}
