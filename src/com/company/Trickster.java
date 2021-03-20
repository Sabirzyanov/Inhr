package com.company;

public class Trickster extends Character {
    public Trickster(String name, String race, double height, double weight, int strength, int dexterity, int intelligence) {
        super(name, race, height, weight, strength, dexterity, intelligence);
    }

    public void increaseDex() {
        setDexterity(getDexterity() * 2);
        System.out.println("Ваша ловкость увеличилась в 2 раза");
    }

    public double backstab(Character c1) {
        return hit(c1) * 10;
    }

    public double useThrowingDagger(int daggerDamage, Character c1) {
        double chanceToHit = Math.random();
        if (chanceToHit >= 0.5) {
            return hit(c1) * daggerDamage;
        } else {
            return 0;
        }
    }

}
