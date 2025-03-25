package com.patterns.structural.adapter;

public class PrinterAdapter implements Printer {

    private final NewExternalPrinter newExternalPrinter = new NewExternalPrinter();

    @Override
    public void printDocument() {
        newExternalPrinter.print();
    }
}
