package com.company;

import java.util.Random;

public class Mage extends Character {
    private int mana = 200;
    private Spell[] spells = new Spell[0];

    public Mage(String name, String race, double height, double weight, int strength, int dexterity,
                int intelligence) {
        super(name, race, height, weight, strength, dexterity, intelligence);
    }

    public void learnNewSpell (Spell newSpell) {

        if (getCoins() -  newSpell.getLearnCost() < 0) {
            System.out.println("Вам не хватает деняк");
            return;
        }

        Spell[] newSpellsCopy = new Spell[spells.length + 1];
        for (int i = 0; i < spells.length; i++) {
            newSpellsCopy[i] = spells[i];
        }
        newSpellsCopy[newSpellsCopy.length - 1] = newSpell;
        spells = newSpellsCopy;

        setCoins(getCoins() - newSpell.getLearnCost());
    }

    public void useSpell(Character c1) {
        Random rand = new Random();
        int selectedSpell = rand.nextInt(spells.length);
        if (this.mana - spells[selectedSpell].getManaCost() > 0) {
            spells[selectedSpell].use(c1);
            this.mana -= spells[selectedSpell].getManaCost();
        } else {
            System.out.println("Не получилось использовать магию.");
        }
    }




}
