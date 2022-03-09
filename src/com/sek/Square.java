package com.sek;

public class Square extends Rectangle{

    private double side;

    public Square(String color, boolean filled, double length, double width, double side) {
        super(color, filled, length, width);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Квадрат: " +
                "Сторона=" + side +
                "подкласса: " + super.toString();
    }


}
