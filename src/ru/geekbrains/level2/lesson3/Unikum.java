package lesson3;

import java.util.*;

public class Unikum {
    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "Бисер", "Болтушка", "Зрелость", "Начало", "Окопать",
                "Подмешать", "Потемнение", "Простуженный", "Прятать", "Прятать",
                "Вызванивать", "Корчага", "Народить", "Они", "Они",
                "Пропашник", "Окуляр", "Синод", "Начало", "Болтушка"
        );

        Set<String> unique = new HashSet<>(words);

        System.out.println("Первоначальный набор слов");
        System.out.println(words.toString());
        System.out.println("Массив с уникальными словами");
        System.out.println(unique.toString());
        System.out.println("Количество повторений: ");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}
