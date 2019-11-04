package com.dta.app;

public class Calculette {

        int a = 12;
        int b = 3;
        int sumAB = sum(a, b);
        int multiAB = multiplication(a, b);

    public static int sum(int a, int b) {
        int result = (a+b);
        return result;
    }
    public static int multiplication(int a,int b) {
        int result = (a*b);
        return result;
    }
}
