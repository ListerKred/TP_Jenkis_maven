package com.dta.app;
/**
 *
 * @author Cathy
 * délcaration de la variable a.
 * déclaration de la variable b.
 * ajout de sumAB.
 * ajout de multiAB.
 */
public class Calculette {

        final int a = 12;
        final int b = 3;
        int sumAB = sum(a, b);
        int multiAB = multiplication(a, b);

    public final int sum(final int a, final int b) {
        int result = a+b;
        return result;
    }
    public final int multiplication(final int a,final int b) {
        int result = a*b;
        return result;
    }
}
