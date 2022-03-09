package com.sek;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter(){
        return (Math.PI*(radius*2))/2;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Круг: " +
                "радиус=" + radius +
                "подкласса: " + super.toString();
    }
}
