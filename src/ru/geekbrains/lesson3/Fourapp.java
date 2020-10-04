package ru.geekbrains.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Fourapp {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        //загадаем слово из массива
        Random random = new Random();
        int indWord = random.nextInt(words.length - 1);
        String word = words[indWord];
        System.out.println("Я загадал одно из этих слов, попробуй отгадать какое");
        for (int i=0;i<words.length;i++)
            System.out.println(words[i]);
        //инициализируем сканер
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введи свое слово: (для выхода Enter)");
            String answer = scanner.nextLine();
            if (answer.equals("")) break;
            else if (word.equals(answer)) {
                System.out.println("Вы угадали слово, игра закончена!!!");
                break;
            }
            char[] charsAnswer = answer.toCharArray();
            for (int i = 0; i < word.length(); i++) {
                if (i >= charsAnswer.length) break;
                if (word.charAt(i) != charsAnswer[i]) charsAnswer[i] = '#';
            }
            StringBuilder comment = new StringBuilder(String.valueOf(charsAnswer));
            for (int i = comment.length(); i < 15; i++) comment.append("#");
            System.out.println(comment);
        }
        while (true);
    }
}
