package com.sek;

public class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(String color, boolean filled, int base, int height){
        super(color, filled);
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Треугольник с основанием =" + base +
                " и высотой =" + height + "подкласс:" + super.toString();
    }

    @Override
    public double getArea() {
        return 0.5*base*height;
    }
}
