package com.zlateva.model;

public class LPAStudent extends Student {

    private double percentComplete;

    public LPAStudent() {
        percentComplete = randomDouble(0, 100.001);
    }

    @Override
    public String toString() {
        return String.format("%s %8.1f%%", super.toString(), percentComplete);
    }

    public double getPercentComplete() {
        return percentComplete;
    }
}
