package com.design_patterns.creational.prototype;

public class Circle extends Shape {

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public Shape clone() {
        return new Circle(this.color);
    }

    @Override
    public void draw() {
        System.out.println("Draw circle with color " + this.color);
    }
}
