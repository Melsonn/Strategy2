package com.company;

public class Divide implements CalculateOperation{
    @Override
    public double solve(int a, int b) {
        return (double) a/b;
    }
}
