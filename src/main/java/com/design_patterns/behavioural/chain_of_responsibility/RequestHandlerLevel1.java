package com.design_patterns.behavioural.chain_of_responsibility;

public class RequestHandlerLevel1 extends RequestHandler {

    @Override
    public void handleRequest(Request request) {
        if (request.getPriority() == Priority.BASIC) {
            log(request.getMessage());
        } else if (nextRequestHandler != null) {
            nextRequestHandler.handleRequest(request);
        } else {
            System.out.println("Request cannot be handled!");
        }
    }

    @Override
    protected void log(String message) {
        System.out.println("RequestHandlerLevel1: " + message);
    }

}