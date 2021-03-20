package com.company;

public class StrongMan extends Character {

    private boolean blockDamage;
    private int shieldArmor;
    private boolean isRage;

    public StrongMan(String name, String race, double height, double weight, int strength, int dexterity, int intelligence, int shieldArmor) {
        super(name, race, height, weight, strength, dexterity, intelligence);
        this.shieldArmor = shieldArmor;
    }

    public void ultimateHit(Character c1) {
        c1.takeHit(hit() * 100);
    }

    public void block() {
        blockDamage = !blockDamage;
        if (blockDamage) {
            setDexterity(getDexterity() - 10);
        }
    }


    @Override
    public void takeHit(double damage) {
        if (blockDamage) {
            damage /= (shieldArmor / 2.0);
        }
        super.takeHit(damage);
    }

    @Override
    public double hit(Character c1) {
        if (getHp() < 500) { // Rage
            return super.hit(c1) * 2.5;
        } else {
            return super.hit(c1);
        }
    }
}
