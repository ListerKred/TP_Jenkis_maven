package com.dta.app;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {
        calcul();
    }

    public static void calcul() {
        int a = 12;
        int b = 3;
        int sumAB = sum(a, b);
        int multiAB = multiplication(a, b);

    }
    public static int sum(int a, int b) {
        int result = (a+b);
        return result;
    }
    public static int multiplication(int a,int b) {
        int result = (a*b);
        return result;
    }
}
