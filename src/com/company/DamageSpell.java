package com.company;

public class DamageSpell extends Spell {
    private int damage;

    public DamageSpell(String name, int learnCost, int manaCost, int damage) {
        super(name, learnCost, manaCost);
        this.damage = damage;
    }

    @Override
    public void use(Character c1) {
        if (c1.getHp() - damage > 0) {
            c1.getHit(damage);
        } else {
            System.out.println("Противник уже мертв");
        }
    }
}
