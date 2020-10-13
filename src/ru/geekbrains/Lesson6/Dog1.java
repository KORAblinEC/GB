package ru.geekbrains.Lesson6;

public class Dog1 extends Dog {

    Dog1 (int lenght, float height){
        super(lenght,height);
    }

    @Override
    boolean run() {
        boolean run;
        if (length<=540){
            run=true;
        } else run=false;
        System.out.println("Dog1.run " + run);
        return run;
    }

    @Override
    boolean swim() {
        boolean swim;
        if (length<=15){
            swim=true;
        } else swim=false;
        System.out.println("Dog1.swim " + swim);
        return swim;
    }

    @Override
    boolean jump() {
        boolean jump;
        if (height<=1F){
            jump=true;
        } else jump=false;
        System.out.println("Dog1.jump " + jump);
        return jump;
    }
}
