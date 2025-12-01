package com.design_patterns.structural.bridge;

public class DrawApiB implements DrawApi {

    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Draw circle - color: blue, x: " + x + ", y: " + y + ", radius: " + radius);
    }

    @Override
    public void drawSquare(int x, int y, int side) {
        System.out.println("Draw square - color: blue, x: " + x + ", y: " + y + ", side: " + side);
    }

}