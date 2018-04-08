package com.example.lambda.demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Hello implements RequestHandler<Object, String> {

    @Override
    public String handleRequest(Object input, Context context) {
        context.getLogger().log("Input: " + input);
        System.out.println("This is application version");
        System.out.println("This is document version");
        System.out.println("This is branching version 1");
        System.out.println("This is branching version 2");

        // TODO: implement your handler
        return "Hello from Lambda";
    }
