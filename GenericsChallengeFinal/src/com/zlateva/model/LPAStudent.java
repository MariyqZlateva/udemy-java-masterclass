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

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        if (fieldName.equalsIgnoreCase("percentComplete")){
            return percentComplete <=Integer.parseInt(value);
        }
        return super.matchFieldValue(fieldName, value);
    }
}
