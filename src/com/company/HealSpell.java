package com.company;

public class HealSpell extends Spell {
    public final int _HP_HEAL = 70;

    public HealSpell(String name, int learnCost, int manaCost) {
        super(name, learnCost, manaCost);
    }

    @Override
    public void use(Character c1) {
        if (c1.getHp() + _HP_HEAL < 1000) {
            c1.setHp(c1.getHp() + _HP_HEAL);
        } else {
            System.out.println("У персонажа уже достаточно здоровья");
        }
    }
}
