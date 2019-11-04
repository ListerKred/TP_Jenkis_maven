package com.dta.app;

public class Calculette {

        final int a = 12;
        final int b = 3;
        int sumAB = sum(a, b);
        int multiAB = multiplication(a, b);

    public final int sum(int a, int b) {
        final int result = (a+b);
        return result;
    }
    public final int multiplication(int a,int b) {
        final int result = (a*b);
        return result;
    }
}
