/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swt301.quadraticequation.core;

/**
 *
 * @author Admin
 */
public class QuadraticEquation {

    private double round(double num) {
        double temp = num * 100;
        temp = Math.round(temp);
        temp = temp / 100;
        return temp;
    }

    public double[] findRoot(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("Invalid argument. "
                    + "a must not be 0");
        }

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            return new double[0];
        } else if (delta == 0) {
            return new double[]{round(-b / 2 * a)};
        } else {
            double root1 = round((-b + Math.sqrt(delta)) / 2 * a);
            double root2 = round((-b - Math.sqrt(delta)) / 2 * a);
            return new double[]{root1, root2};
        }
    }
}
