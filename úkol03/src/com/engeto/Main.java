package com.engeto;

public class Main {

    static final String fizz = "fizz";
    static final String buzz = "buzz";
    static final String fizzbuzz = "fizzbuzz";

    public static void fizzBuzzJava() {
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) System.out.println(fizzbuzz);
            else if (i % 5 == 0)  System.out.println(buzz);
            else if (i % 3 == 0)  System.out.println(fizz);
            else System.out.println(i);
        }
    }

    public static void main(String[] args) {
        fizzBuzzJava();
    }
}