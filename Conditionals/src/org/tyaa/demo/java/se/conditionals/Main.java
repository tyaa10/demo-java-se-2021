package org.tyaa.demo.java.se.conditionals;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Input an integer number in range [-10;10] or in range [100;200]");
            int x = sc.nextInt();
            if(x >= -10 && x <= 10) {
                System.out.println("x = " + x + " is in range [-10;10]");
            } else if(x >= 100 && x <= 200) {
                System.out.println("x = " + x + " is in range [100;200]");
            } else {
                System.out.println("x = " + x + " is NOT in range [-10;10] and is NOT in range [100;200]");
            }
        } while (true); */

        /* Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Input an integer number in range [1;7]");
            int x = sc.nextInt();
            switch (x) {
                case 1: {
                    System.out.println("Понедельник");
                    break;
                }
                case 2: {
                    System.out.println("Вторник");
                    break;
                }
                // TODO добавить ветви для остальных дней недели
                default: {
                    System.out.println("Неизвестный день");
                }
            }
        } while (true); */

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Введите целое положительное число");
            int x = sc.nextInt();
            int x10 = x % 10;
            // TODO добавить обработку исключения из грамматического правила:
            // слово "ворона" с числом, заканчивающимся на 11, 12, 13 или 14,
            // выводить без окончания
            switch (x10) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9: {
                    System.out.println(x + " ворон");
                    break;
                }
                case 2:
                case 3:
                case 4: {
                    System.out.println(x + " вороны");
                    break;
                }
                case 1: {
                    System.out.println(x + " ворона");
                    break;
                }
            }

        } while (true);
    }
}
