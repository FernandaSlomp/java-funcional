package com.amigoscode.functionalinterface;

import java.util.function.Function;

public class _Function {

    public static void main(String[] args){
        int increment = incrementByOne(2);
        int incrementFunction = incrimentByOneFunction.apply(2);
        System.out.println(increment);
        System.out.println(incrementFunction);
    }

    static Function<Integer, Integer> incrimentByOneFunction = number -> number++;

//    static Function<Integer, Integer> incrimentByOneFunction = number -> number++;

    static int incrementByOne(int number){
        return number + 1;
    }

}
