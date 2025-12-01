package com.design_patterns.behavioural.chain_of_responsibility;

public abstract class RequestHandler {

    protected RequestHandler nextRequestHandler;

    public void setNextRequestHandler(RequestHandler requestHandler) {
        this.nextRequestHandler = requestHandler;
    }

    public abstract void handleRequest(Request request);

    protected abstract void log(String message);

}
