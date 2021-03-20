package com.company;

public class StrongMan extends Character {
    private int armor;
    public StrongMan(String name, String race, double height, double weight, int strength, int dexterity, int intelligence, int armor) {
        super(name, race, height, weight, strength, dexterity, intelligence);
        this.armor = armor;
    }

    public double superHit(Character c1) {
        return hit(c1) * 10;
    }
}
