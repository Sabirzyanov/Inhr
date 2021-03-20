package com.company;

public class Character {
    private String name;
    private String race;
    private double height;
    private double weight;
    // От 1 до 100, исключая некоторые классы
    private int strength;
    private int dexterity;
    private int intelligence;

    private int hp = 1000;

    public Character(String name, String race, double height, double weight, int strength, int dexterity, int intelligence) {
        this.name = name;
        this.race = race;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }

    double hit(Character c1) {
        double damage = (strength + dexterity + intelligence) * (height / weight);
        if (c1.getHp() - (int) damage > 0) {
            c1.setHp(c1.getHp() - (int) damage);
        }
        return damage;
    }

    double hit() {
        System.out.println("Вы бьёте воздух!");
        return (strength + dexterity + intelligence) * (height / weight);
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getHp() {
        return hp;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
