package com.sek;
//abstract
public class Shape {
    private String color;
    private boolean filled;
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Цвет фигуры=\'" + color + "Статус заливки=" + filled;
    }

    public double getArea(){
        System.err.println("Фигура неизвестна! Невозможно вычислить площадь");
        return 0;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
