package ru.geekbrains.Lesson6;

public class Cat extends Animal {

    Cat (int lenght, float height){
        super(lenght,height);
    }

    @Override
    boolean run() {
        boolean run;
        if (length<=200){
            run=true;
        } else run=false;
        System.out.println("Cat.run " + run);
        return run;
    }

    @Override
    boolean swim() {
        boolean swim;
        if (length==0){
            swim=true;
        } else swim=false;
        System.out.println("Cat.swim " + swim);
        return swim;
    }

    @Override
    boolean jump() {
        boolean jump;
        if (height<=2){
            jump=true;
        } else jump=false;
        System.out.println("Cat.jump " + jump);
        return jump;
    }
}
