package com.company;

public class Difference implements CalculateOperation{
    @Override
    public double solve(int a, int b) {
        return Math.abs(a-b);
    }
}
