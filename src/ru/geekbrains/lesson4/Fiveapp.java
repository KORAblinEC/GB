package ru.geekbrains.lesson4;
import java.util.Random;
import java.util.Scanner;
public class Fiveapp {
    static char[][] map;
    static final int SIZE = 3;
    static final int DOTS_TO_WIN = 3;

    static final char DOT_EMPTY = '.';
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';

    public static void main(String[] args)
    {
        // write your code here

        // 1. инициализировать поле
        initMap();

        // 1.1 Вывод поля
        printMap();

        // в цикле
        while (true)
        {
            // 2. Выбор игральной фишки. - ДОП К ДЗ
            // 3. Ход первого игрока.
            makeHumanTurn();
            // 4. Вывод поля.
            printMap();
            // 5. Проверка на 3 в ряд и диагональ.
            if (hasWin(DOT_X))
            {
                System.out.println("Победил человек!");
                break;
            }
            // 6. Проверка на ничью.
            if (isMapFull())
            {
                System.out.println("Ничья");
                break;
            }

            // 7. Ход второго игрока (ИИ).
            makeAiTurn();

            // 8. Вывод поля.
            printMap();

            // 9. Проверка на 3 в ряд и диагональ.
            if (hasWin(DOT_O))
            {
                System.out.println("Победил Т-1000");
                break;
            }

            // 10. Проверка на ничью.
            if (isMapFull())
            {
                System.out.println("Ничья");
                break;
            }
        }
    }

    // 1. Инициализация.
    static void initMap()
    {
        map = new char[SIZE][SIZE];

        for (int i = 0; i < map.length; i++)
        {
            for (int j = 0; j < map[i].length; j++)
            {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    // Вывод поля
    static void printMap()
    {
        for (int i = 0; i <= map.length; i++)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < map.length; i++)
        {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map[i].length; j++)
            {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

    // Ход первого игрока (человека)
    static void makeHumanTurn()
    {
        Scanner scanner = new Scanner(System.in);

        int x;
        int y;

        do
        {
            System.out.println("Введите координаты в формате X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));

        map[y][x] = DOT_X;
    }

    // Ход второго игрока (ИИ)
    static void makeAiTurn()
    {
        Random random = new Random();

        int x;
        int y;

        do
        {
            System.out.println("Введите координаты в формате X Y");
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));

        System.out.println("Компьютер сходил в точку: " + (x + 1) + " " + (y + 1));

        map[y][x] = DOT_O;
    }

    // Проверка хода
    static boolean isCellValid(int x, int y)
    {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE)
        {
            return false;
        }
        else if (map[y][x] == DOT_EMPTY)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // Проверка на победу
    static boolean hasWin(char c) {
        int countV;
        int countH;
        int countDiagonalA = 0;
        int countDiagonalB = 0;
        for (int i = 0; i <= SIZE - 1; i++) {
            countH = 0;
            countV = 0;
            for (int j = 0; j <= SIZE - 1; j++) {
                //горизонталь
                if (map[i][j] == c) {
                    countH++;
                    if (countH == SIZE) return true;
                }

                //вертикаль
                if (map[j][i] == c) {
                    countV++;
                    if (countV == SIZE) return true;
                }
            }

            // диагональ А
            if (map[i][i] == c) {
                countDiagonalA++;
                if (countDiagonalA == SIZE) return true;
            } else countDiagonalA = 0;

            // Диагональ Б
            if (map[i][SIZE - 1 - i] == c) {
                countDiagonalB++;
                if (countDiagonalB == SIZE) return true;
            } else countDiagonalB = 0;
        }
        return false;
    }


    // Ничья
    static boolean isMapFull()
    {
        for (int i = 0; i < map.length; i++)
        {
            for (int j = 0; j < map[i].length; j++)
            {
                if (map[i][j] == DOT_EMPTY)
                {
                    return false;
                }
            }
        }

        return true;
    }
}
