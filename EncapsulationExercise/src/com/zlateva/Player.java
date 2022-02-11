package com.zlateva;

public class Player {
    public String FullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health = this.health-damage;
        if(this.health<=0){
            System.out.println("Player knocked out");
            // Reduce numbers of lives remaining for the player
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
