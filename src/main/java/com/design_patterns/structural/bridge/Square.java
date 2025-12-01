package com.design_patterns.structural.bridge;

public class Square extends Shape {

    private int x, y, side;

    public Square(int x, int y, int side, DrawApi drawApi) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.side = side;
    }

    @Override
    public void draw() {
        this.drawApi.drawSquare(x, y, side);
    }
}
