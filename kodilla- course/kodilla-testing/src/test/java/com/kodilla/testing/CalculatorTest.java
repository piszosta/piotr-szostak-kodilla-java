package com.kodilla.testing;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testAdding () {
        Calculator calc = new Calculator();

        int result = calc.adding(1, 3);

        Assert.assertEquals(4, result);
    }
    @Test
    public void testSubstracting () {
        Calculator calcSub = new Calculator ();

        int resultSub = calcSub.substract(5, 1);

        Assert.assertEquals( 4, resultSub);
        }



    }
