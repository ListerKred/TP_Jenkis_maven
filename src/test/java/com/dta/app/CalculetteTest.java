package com.dta.app;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.dta.app.Calculette;

public class CalculetteTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testSum() {
        int a = 3;
        int b = 5;
        int expected = 8;

        Calculette calc = new Calculette();
        int actual = calc.sum(a,b);
        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void testMultiplication() {
        int a = 3;
        int b = 5;
        int expected = 15;

        Calculette calc = new Calculette();
        int actual = calc.multiplication(a,b);
        Assert.assertEquals(expected, actual, 0);
    }

}
