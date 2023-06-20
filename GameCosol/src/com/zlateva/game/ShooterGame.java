package com.zlateva.game;

import java.util.LinkedHashMap;
import java.util.Map;

public class ShooterGame extends Game<Shooter> {
    public ShooterGame(String gameName) {
        super(gameName);
    }

    @Override
    public Shooter createNewPlayer(String name) {
        return new Shooter(name);
    }

    @Override
    public Map<Character, GameAction> getGameAction(int playerIndex) {

        var map = new LinkedHashMap<>(Map.of(
                'F',
                new GameAction('F', "Fined Prize ", this::findPrize),
                'S',
                new GameAction('S', "Use your gun ", this::useWeapon)
        ));
        map.putAll(getStandardAction());
        return map;
    }

    public boolean findPrize(int playerIndex) {
        return getPlayer(playerIndex).finedPrize();
    }

    public boolean useWeapon(int playerIndex) {
        return getPlayer(playerIndex).useWeapon("pistol");
    }
}
