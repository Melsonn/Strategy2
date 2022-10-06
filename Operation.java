package com.company;

public class Operation {
    private CalculateOperation calculate;

    public Operation(CalculateOperation calculate) {
        this.calculate = calculate;
    }

    public double getAnswer(int a, int b){
        return calculate.solve(a,b);
    }
}
