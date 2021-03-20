package com.company;

public class StrongMan extends Character {

    private boolean blockDamage;
    private int shieldArmor;
    private boolean isRage;

    public StrongMan(String name, String race, double height, double weight, int strength, int dexterity, int intelligence, int shieldArmor) {
        super(name, race, height, weight, strength, dexterity, intelligence);
        this.shieldArmor = shieldArmor;
    }

    public double ultimateHit(Character c1) {
        return hit(c1) * 100;
    }

    void block() {
        blockDamage = !blockDamage;
        if (blockDamage) {
            setDexterity(getDexterity() - 10);
        }
    }

    void rage() {
        if (getHp() < 500) {
            isRage = true;
        }
    }


    @Override
    protected void getHit(double damage) {
        if (blockDamage) {
            damage /= (shieldArmor / 2.0);
        }
        super.getHit(damage);
    }

    @Override
    double hit(Character c1) {
        if (isRage) {
            return super.hit(c1) * 2.5;
        } else {
            return super.hit(c1);
        }
    }
}
