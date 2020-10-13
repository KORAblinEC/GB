package ru.geekbrains.Lesson6;

public abstract class Animal {
    protected int length;
    protected float height;

    abstract boolean run ();
    abstract boolean swim ();
    abstract boolean jump ();


    public Animal(int length, float height) {
        this.length = length;
        this.height = height;
    }
}
