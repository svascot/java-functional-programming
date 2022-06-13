package main.java.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        System.out.println("Function");

        Integer multipliedByTen = multiplyByTen.apply(10);
        System.out.println(multipliedByTen);

        String message = sayHappyBirthday.apply("Santi", 29);
        System.out.println(message);

        // Functions ca be concatenated
        Integer concatenatedResult = multiplyByTen.andThen(incrementByOne).apply(10);
        System.out.println(concatenatedResult);
    }

    // Function takes 1 argument and produce 1 result;
    static Function<Integer, Integer> multiplyByTen = number -> number *= 10;

    // BiFunction takes two arguments and return one result;
    static BiFunction<String, Integer, String> sayHappyBirthday = (name, age) -> "Happy " + age + " Birthday " + name;

    static Function<Integer, Integer> incrementByOne = number -> ++number;
}
