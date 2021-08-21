package org.tyaa.demo.java.se.loops;

public class Main {

    public static void main(String[] args) {
        /* for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        } */

        /* int i = 1;
        // int i = 11;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10); */

        // int i = 1;
        /* int i = 11;
        while (i <= 10) {
            System.out.println(i);
            i++;
        } */

        /* // 1. Вывести таблицу умножения 1 - 10

        // цикл вывода строк
        for (int i = 0; i < 11; i++) {
            // цикл вывода ячеек текущей строки
            for (int j = 0; j < 11; j++) {
                // когда выводится первая строка
                if (i == 0) {
                    // печатать номер ячейки в текущей строке
                    // System.out.print(j);
                    System.out.printf("%5d", j);
                } else if (j == 0) {
                    // печатать номер строки в первой ячейке каждой строки
                    System.out.printf("%5d", i);
                } else {
                    System.out.printf("%5d", i * j);
                }
            }
            System.out.println();
        } */

        /* // 2. Вывести таблицу умножения 1 - 10
        //, прервав вывод после распечатки ячейки строки 5 колонки 4?
        //, но продолжив затем выводить остальные строки

        // цикл вывода строк
        for (int i = 0; i < 11; i++) {
            // цикл вывода ячеек текущей строки
            for (int j = 0; j < 11; j++) {
                // когда выводится первая строка
                if (i == 0) {
                    // печатать номер ячейки в текущей строке
                    // System.out.print(j);
                    System.out.printf("%5d", j);
                } else if (j == 0) {
                    // печатать номер строки в первой ячейке каждой строки
                    System.out.printf("%5d", i);
                } else {
                    System.out.printf("%5d", i * j);
                }
                if (i == 5 && j == 4) {
                    break;
                }
            }
            System.out.println();
        } */

        /* // 3. Вывести таблицу умножения 1 - 10
        //, прервав вывод после распечатки ячейки строки 5 колонки 4
        //, так, чтобы на этом закончился вывод таблицы

        // цикл вывода строк
        ROWS_LOOP : for (int i = 0; i < 11; i++) {
            // цикл вывода ячеек текущей строки
            for (int j = 0; j < 11; j++) {
                // когда выводится первая строка
                if (i == 0) {
                    // печатать номер ячейки в текущей строке
                    // System.out.print(j);
                    System.out.printf("%5d", j);
                } else if (j == 0) {
                    // печатать номер строки в первой ячейке каждой строки
                    System.out.printf("%5d", i);
                } else {
                    System.out.printf("%5d", i * j);
                }
                if (i == 5 && j == 4) {
                    break ROWS_LOOP;
                }
            }
            System.out.println();
        } */

        // 4. Вывести таблицу умножения 1 - 10
        //, кроме строки 6

        // цикл вывода строк
        for (int i = 0; i < 11; i++) {
            if (i == 6) {
                continue;
            }
            // цикл вывода ячеек текущей строки
            for (int j = 0; j < 11; j++) {
                // когда выводится первая строка
                if (i == 0) {
                    // печатать номер ячейки в текущей строке
                    // System.out.print(j);
                    System.out.printf("%5d", j);
                } else if (j == 0) {
                    // печатать номер строки в первой ячейке каждой строки
                    System.out.printf("%5d", i);
                } else {
                    System.out.printf("%5d", i * j);
                }
            }
            System.out.println();
        }
    }
}
