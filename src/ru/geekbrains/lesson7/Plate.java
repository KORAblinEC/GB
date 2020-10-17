package ru.geekbrains.lesson7;

import java.util.Scanner;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        if (n > this.food) {
            System.out.println("Еды в тарелке не хватает. Там осталось " + this.food + " единиц еды.");
        } else System.out.println("В тарелке осталось " + (this.food -= n) + " единиц еды.");
    }

    public void satietyCat (Cat cat){
        cat.satiety(this.food);
    }

    public void info() {
        System.out.println("Изначально еды в тарелке было: " + food + " единиц(ы)");
    }

    public void upFood (int n){
        this.food+=n;
    }

    public void infoUfFood() {
        System.out.println("Еды в тарелке стало: " + food + " единиц(ы)");
    }
}