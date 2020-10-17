package ru.geekbrains.lesson7;

import java.util.Scanner;

public class Cat {
    private boolean satiety;
    private String name;
    private int appetite;
    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    public void eat(Plate plate) {
        plate.decreaseFood(appetite);
    }

    public boolean satiety (int n){
        if (appetite>n){
            satiety=false;
            System.out.println("Кот " + name + " не поел. Ему не хватает " + (appetite-n) + " единиц еды.");
        } else if (appetite<=n){
            satiety=true;
            System.out.println("Кот " + name + " поел.");
        }
        System.out.println("Сытость кота по имени " + name + ":" + " " + satiety);
        return satiety;
    }
}
