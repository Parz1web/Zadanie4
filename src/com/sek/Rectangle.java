package com.sek;

public class Rectangle extends Shape {

    private double length = 1.0;
    private double width = 1.0;

    public Rectangle(String color, boolean filled, double length, double width){
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Прямоугольник длины=" + length + " и ширины=" + width + ", подкласса" + super.toString();
    }

    @Override
    public double getArea() {
        return length*width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getPerimeter(){
        return 2*(width+length);
    }
}
