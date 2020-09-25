package ru.geekbrains.lesson1;

public class FirstApp {
    public static void main(String[] args)
    {
        byte myByte=120;
        short myShort=125;
        int myInt=130;
        long myLong=140;
        float myFloat=3;
        double myDouble=6;
        char mySchar=2;
        boolean myBoolean1=true;
        boolean myBoolean2=false;
       System.out.println(result1(1,2,3,4));
       System.out.println(result2(1,21));
       result3(-20);
       System.out.println(result4(-1));
       result5("Василий");
       result6(2020);
    }
    static Float result1 (Integer a, Integer b, Integer c, Integer d)
    {
        Float s = (a * (b + ((float)c / d)));
        return s;

    }
    static Boolean result2 (Integer a, Integer b)
    {
        Boolean r=true;
        if ((a + b >= 10) && (a+b<=20)) return r;
        else return !r;

    }
    static void result3 (Integer a)
    {
        if (a>=0) System.out.println("Передали положительное число, " + a);
        else System.out.println("Передали отрицательное число, " + a);
    }
    static Boolean result4 (Integer a)
    {
        Boolean r=true;
        if (a < 0) return r;
        else return !r;

    }

    static void result5 (String name) {
        System.out.println("Привет, " + name);
    }

    static void result6 (Integer year) {
        if (year%4==0 && year%100 !=0 || year%400==0)
        System.out.println("Год "+year+ " високосный");
        else System.out.println("Год "+year+ " невисокосный");
    }

}
