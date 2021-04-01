package com.githab.eefimova.part1;

import org.apache.commons.math3.fraction.BigFraction;

import static java.lang.Math.pow;
import java.math.BigInteger;


public class TanTaylor {
    public static final int steps = 10;

    public TanTaylor() {
    }

    public static void main(String[] args) {
        TanTaylor tl = new TanTaylor();
        System.out.println(tl.cos(3*Math.PI/4));
        System.out.println(tl.sin(3*Math.PI/4));
        System.out.println(tl.tan3(3*Math.PI/4));
    }

   public double cos(double x) {
        double taylor = 0;
        for (int n = 0; n < steps; n++){
            taylor = taylor + (Math.pow(-1, n) * (Math.pow(x, 2 * n))) / factorial(2 * n);
        }
        return taylor;
    }

    public double sin(double x) {
        double taylor = 0;
        for (int n = 0; n < steps; n++){
            taylor = taylor + (Math.pow(-1, n) * (Math.pow(x, 2 * n + 1))) / factorial(2 * n + 1);
        }
        return taylor;
    }

    public double tan3(double x) {
        double cos = cos(x);
        if (Math.abs(cos) < 1E-10) {
            return Double.POSITIVE_INFINITY;
        }
        return sin(x) / cos;
    }


    private static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    /*public static BigInteger factorial(int n){
        BigInteger fact = new BigInteger("1");
        for (int i=1; i<=n; i++) {
            fact = multiply(i,fact);
        }
        return fact;
    }*/

    public static BigInteger multiply ( int a, BigInteger b ) {
        return BigInteger.valueOf( a ).multiply( b );
    }

    private static BigFraction bern(int n) {
        BigFraction[] A = new BigFraction[n + 1];
        for (int m = 0; m <= n; m++) {
            A[m] = new BigFraction(1, (m + 1));
            for (int j = m; j >= 1; j--)
                A[j - 1] = (A[j - 1].subtract(A[j])).multiply(new BigFraction(j));
        }
        return A[0];
    }


    private static BigFraction num(int n) {
        return new BigFraction(n);
    }

    private static BigFraction num(double n) {
        return new BigFraction(n);
    }
}
