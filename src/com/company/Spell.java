package com.company;

public class Spell {
    private String name;
    private int learnCost;
    private int manaCost;

    public Spell(String name, int learnCost, int manaCost) {
        this.name = name;
        this.learnCost = learnCost;
        this.manaCost = manaCost;
    }

    public void use(Character c1) {
        c1.getHit(0);
    }


    public String getName() {
        return name;
    }

    public int getLearnCost() {
        return learnCost;
    }

    public void setLearnCost(int learnCost) {
        this.learnCost = learnCost;
    }

    public int getManaCost() {
        return manaCost;
    }

    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }
}
