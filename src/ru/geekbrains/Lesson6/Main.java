package ru.geekbrains.Lesson6;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat(0, 0);
        Dog dog = new Dog(5, 0.5F);
        Dog dog1 = new Dog1(520, 1F);
        cat.run();
        cat.swim();
        cat.jump();
        dog.run();
        dog.swim();
        dog.jump();
        dog1.run();
        dog1.swim();
        dog1.jump();
    }
}