package com.patterns.creational.prototype;

public abstract class Shape {

    protected String color;

    public abstract Shape clone();

    public abstract void draw();

}