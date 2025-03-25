package com.patterns.structural.bridge;

public class DrawApiA implements DrawApi {

    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Draw circle - color: red, x: " + x + ", y: " + y + ", radius: " + radius);
    }

    @Override
    public void drawSquare(int x, int y, int side) {
        System.out.println("Draw square - color: red, x: " + x + ", y: " + y + ", side: " + side);
    }

}