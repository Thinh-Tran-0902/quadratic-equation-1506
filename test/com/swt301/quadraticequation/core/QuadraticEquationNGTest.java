/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swt301.quadraticequation.core;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Admin
 */
public class QuadraticEquationNGTest {

    public QuadraticEquationNGTest() {
    }

    /**
     * Test of findRoot method, of class QuadraticEquation.
     */
    @Test
    public void testOneRoot() {
        System.out.println("testOneRoot");
        double a = 1;
        double b = -2;
        double c = 1;
        QuadraticEquation instance = new QuadraticEquation();
        double[] expResult = {1};
        double[] result = instance.findRoot(a, b, c);
        assertEquals(result, expResult);
    }

    @Test
    public void testTwoRoot() {
        System.out.println("testTwoRoot");
        double a = 1;
        double b = -3;
        double c = 2;
        QuadraticEquation instance = new QuadraticEquation();
        double[] expResult = {2, 1};
        double[] result = instance.findRoot(a, b, c);
        assertEquals(result, expResult);
    }
    
    @Test
    public void testNoRoot() {
        System.out.println("testNoRoot");
        double a = 1;
        double b = -2;
        double c = 2;
        QuadraticEquation instance = new QuadraticEquation();
        double[] expResult = {};
        double[] result = instance.findRoot(a, b, c);
        assertEquals(result, expResult);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testInvalidGradient() {
        System.out.println("testInvalidGradient");
        double a = 0;
        double b = -1;
        double c = 1;
        QuadraticEquation instance = new QuadraticEquation();
        double[] expResult = {1};
        double[] result = instance.findRoot(a, b, c);
    }
}
