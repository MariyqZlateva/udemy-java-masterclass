package com.zlateva;

import com.zlateva.game.GameConsole;
import com.zlateva.game.ShooterGame;

public class Main {
    public static void main(String[] args) {
        var console = new GameConsole<>(new ShooterGame("The Shootout Game"));

        int playerIndex = console.addPlayer();
        console.playGame(playerIndex);
    }
}