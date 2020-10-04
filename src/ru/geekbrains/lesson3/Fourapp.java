package ru.geekbrains.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Fourapp {
    public static void main(String[] args) {
        String xxx = "xxxxxxxxxxxxxxx";
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println("Компьютер загадал одно из этих слов: ");
            for(int i = 0; i < words.length; i++){
                System.out.println(words[i]);
            }
            Random random = new Random();
            int index = random.nextInt(words.length);
            //System.out.println(words[index]);
            System.out.println("Попробуйте угадать какое слово он загадал: введите ответ ниже");
            Scanner sc = new Scanner(System.in);
            String a = sc.next();
            String b = words[index];

    }
}
