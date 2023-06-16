package com.zlateva.game;

public record Shooter(String name) implements Player {
    boolean finedPrize() {
        System.out.println("Prize found, score should be adjusted.");
        return false;
    }

    boolean useWeapon(String weapon) {
        System.out.println("You Shot your " + weapon);
        return false;
    }
}
