package com.design_patterns.behavioural.chain_of_responsibility;

public class RequestHandlerLevel3 extends RequestHandler {

    @Override
    public void handleRequest(Request request) {
        if (request.getPriority() == Priority.CRITICAL) {
            log(request.getMessage());
        } else {
            System.out.println("Request cannot be handled!");
        }
    }

    @Override
    protected void log(String message) {
        System.out.println("RequestHandlerLevel3: " + message);
    }

}