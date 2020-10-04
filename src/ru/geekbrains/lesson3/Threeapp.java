package ru.geekbrains.lesson3;
import java.util.Random;
import java.util.Scanner;

public class Threeapp {
    public static void main(String[] args) {
        Random rand = new Random();
        boolean bool=false;
        int a1;
        do {
            int x = rand.nextInt(10);
            System.out.println("Компьютер загадал число от 0 до 9. Как вы думаете, какое? Введите свой вариант ниже: ");
            for (int i=3;i>0;i--){
                Scanner sc = new Scanner(System.in);
                while (!sc.hasNextInt()) {
                    System.out.println("\nНе пытайся обмануть меня, межок с костями. Введи число!");
                    sc.nextLine();
                }
                int a = sc.nextInt();
                if (a!=x){
                    System.out.println("Вы не угадали. Число оставшихся попыток " + (i-1));
                    bool=false;
                    if (a>x){
                        System.out.println("Введенное число больше загаданного");
                    } else System.out.println("Введенное число меньше загаданного");
                } else if (a==x){
                    bool=true;
                    break;
                }
            }
            if (bool==false){
                System.out.println("Продули. Хотите попробовать еще раз? Введите 1, если хотите повторить или 0, если хотите сдаться. P.S. Загаданное число было: " + x);
            } else System.out.println("Выирали. Хотите попробовать еще раз? Введите 1, если хотите повторить или 0, если хотите сдаться. P.S. Загаданное число было: " + x);
            Scanner sc2 = new Scanner(System.in);
            a1 = sc2.nextInt();
        } while (a1==1);

    }
}
