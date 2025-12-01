package com.design_patterns.structural.adapter;

public class LegacyPrinter implements Printer {

    public void printDocument() {
        System.out.println("legacy printer print");
    }

}
