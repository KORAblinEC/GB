package ru.geekbrains.lesson7;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Игорь", 5, false);//Создаем кота 1
        Cat cat2 = new Cat("Валера", 6, false);//Создаем кота 2
        Cat cat3 = new Cat("Акакий", 7, false);//Создаем кота 3
        Cat [] Cats=new Cat[]{cat1, cat2, cat3};//Создаем массив котов
        Plate plate = new Plate(15);//создаем тарелку с едой для котов
        plate.info();//Изначальное количество еды в тарелке
        for (int i=0; i< Cats.length;i++){
            plate.satietyCat(Cats[i]);
            Cats[i].eat(plate);
            System.out.println();
        }
        plate.upFood(20);//Добавляем в миску 20 единиц еды
        plate.infoUfFood();//Конечное количество еды в тарелке

    }
}
