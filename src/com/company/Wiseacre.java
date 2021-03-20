package com.company;

public class Wiseacre extends Character {
    private int mind;
    private boolean isMage; // Он маг, если читал много книг по волшебству, ведь умники много читают книг
    public Wiseacre(String name, String race, double height, double weight, int strength, int dexterity,
                    int intelligence, int mind, boolean isMage) {
        super(name, race, height, weight, strength, dexterity, intelligence);
        this.mind = mind;
        this.isMage = isMage;
    }

    public void learning() {
        setIntelligence(getIntelligence() * mind);
        System.out.printf("Ваш интеллект увеличился в %d раз\n", mind);
    }

    public void healing(int healHP) {
        if (getHp() + healHP < 100) {
            setHp(getHp() + healHP);
        } else {
            System.out.println("Ваше здоровье уже максимально");
        }
    }

    // Spell level - От 1 до 5
    public double useHitSpell(int spellLevel, Character c1) {
        if (isMage) {
            return hit(c1) * spellLevel;
        } else {
            System.out.println("Увы, но вы не маг");
            return -1;
        }
    }
}
