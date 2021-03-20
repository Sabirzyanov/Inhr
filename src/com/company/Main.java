package com.company;

public class Main {

    public static void main(String[] args) {
        StrongMan warrior = new StrongMan("Steven", "Breton", 160, 50, 30, 10, 10, 40);
        Wiseacre mage = new Wiseacre("Jack", "Imperial", 150, 50, 5, 10, 60, 50, true);
        warrior.hit(mage);
        System.out.println(mage.getHp());
    }
}
