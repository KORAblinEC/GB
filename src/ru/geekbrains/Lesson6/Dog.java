package ru.geekbrains.Lesson6;

public class Dog extends Animal {

    Dog (int lenght, float height){
        super(lenght,height);
    }

    @Override
    boolean run() {
        boolean run;
        if (length<=500){
            run=true;
        } else run=false;
        System.out.println("Dog.run " + run);
        return run;
    }

    @Override
    boolean swim() {
        boolean swim;
        if (length<=10){
            swim=true;
        } else swim=false;
        System.out.println("Dog.swim " + swim);
        return swim;
    }

    @Override
    boolean jump() {
        boolean jump;
        if (height<=0.5F){
            jump=true;
        } else jump=false;
        System.out.println("Dog.jump " + jump);
        return jump;
    }
}
