package com.company;

public class Main {

    public static void main(String[] args) {
        StrongMan warrior = new StrongMan("Steven", "Breton", 160, 50, 30, 10, 10, 30);
        Mage mage = new Mage("Jack", "Imperial", 150, 50, 5, 10, 60);
        DamageSpell damageSpell = new DamageSpell("Молния", 150, 40, 200);
        HealSpell healSpell = new HealSpell("Heal", 200, 30);
        mage.setCoins(1000);
        mage.learnNewSpell(damageSpell);
        mage.learnNewSpell(healSpell);
        mage.useSpell(warrior);
        warrior.hit(mage);
        mage.useSpell(mage);
        System.out.println(warrior.getHp());
        System.out.println(mage.getHp());
    }
}
