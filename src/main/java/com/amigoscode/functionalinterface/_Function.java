package com.amigoscode.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args){

        //Function
        int increment1 = incrementByOne(2);
        System.out.println(increment1);

        int increment2 = incrimentByOneFunction.apply(2);
        System.out.println(increment2);

        int multiply = multiplyBy10Function.apply(2);
        System.out.println(multiply);

        Function<Integer, Integer> addByOneAndThenMultiplyBy10Function = incrimentByOneFunction.andThen(multiplyBy10Function);
        int addByOneAndThenMultiplyBy10 = addByOneAndThenMultiplyBy10Function.apply(4);
        System.out.println(addByOneAndThenMultiplyBy10);

        //BiFunction 2 argumentos e da um resultado

        int resultNoFunction = incrementByOneAndMultiply(2, 3);
        System.out.println(resultNoFunction);

        int resultWithFunction = incrementByOneAndMultiplyFunction.apply(2, 3);
        System.out.println(resultWithFunction);

    }

    //fazem a mesma coisa
    static Function<Integer, Integer> incrimentByOneFunction = number -> number++;
    static int incrementByOne(int number){
        return number + 1;
    }
    //-----
    static Function<Integer, Integer> multiplyBy10Function = number -> number*10;


    //fazem a mesma coisa
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyFunction =
            (numberIncrementByOne, numbernumMultiplyBy)
                    -> ((numberIncrementByOne + 1 ) * numbernumMultiplyBy);
    static int incrementByOneAndMultiply(int number, int numMultiplyBy){
        return (number + 1 ) * numMultiplyBy;
    }
    //-------
}
