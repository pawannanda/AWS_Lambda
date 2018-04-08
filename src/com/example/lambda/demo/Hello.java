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
        System.out.println("This is branching version 3");
        System.out.println("This is branching version 4");
        System.out.println("This is branching version 5");
        System.out.println("This is branching version 6");
        System.out.println("This is branching version 7");
        System.out.println("This is branching version 8");
        System.out.println("This is branching version 9");
        System.out.println("This is branching version 10");

        // TODO: implement your handler
        return "Hello from Lambda";
    }
