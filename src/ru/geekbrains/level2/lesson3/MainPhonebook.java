package ru.geekbrains.level2.lesson3;

public class MainPhonebook {
    public static void main(String[] args){
        System.out.println("Создаем справочник");
        Phonebook phonebook = new Phonebook();
        System.out.println("-----------------");

        System.out.println("Заполним справочник");
        phonebook.add("Иванов", "+79999999991");
        phonebook.add("Иванов", "+79999999992");
        phonebook.add("Петров", "+79999999993");
        phonebook.add("Сидоров", "+79999999994");
        phonebook.add("Иванов", "+79999999995");
        System.out.println("-----------------");

        System.out.println("Находим номера в справочнике");
        System.out.println("Иванов");
        System.out.println(phonebook.get("Иванов"));
        System.out.println("Петров");
        System.out.println(phonebook.get("Петров"));
        System.out.println("Сидоров");
        System.out.println(phonebook.get("Сидоров"));
        System.out.println("-----------------");

        System.out.println("Пробуем найти несуществующую запись");
        System.out.println("Кузнецов");
        System.out.println(phonebook.get("Кузнецов"));
        System.out.println("-----------------");

        System.out.println("Пробуем записать существующий номер");
        phonebook.add("Иванов", "+79999999991");
        System.out.println("Иванов");
        System.out.println(phonebook.get("Иванов"));
    }
}
