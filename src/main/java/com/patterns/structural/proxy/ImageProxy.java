package com.patterns.structural.proxy;

public class ImageProxy implements Image {

    private Image realImage;
    private final String fileName;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            System.out.println("Fetching image from disc");
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }

}