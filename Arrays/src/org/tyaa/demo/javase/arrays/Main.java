package org.tyaa.demo.javase.arrays;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    /* String word1 = "Hello";
        String word2 = "World";
        String word3 = "!";
        System.out.printf("%s %s%s", word1, word2, word3); */

	    /* String[] words = new String[5];
        Scanner sc = new Scanner(System.in);
        final int MAX_WORD_COUNT = 5;
        int wordCount = 0;
        do {
            System.out.println("Input next word, ',', ':', '-' or '.'");
            String word = sc.nextLine();
            words[wordCount] = word.trim();
            if (words[wordCount].isBlank()
                    || words[wordCount].equals(".")
                    || words[wordCount].equals("!")
            ) {
                break;
            }
        } while (wordCount++ < MAX_WORD_COUNT);
        System.out.println(
                String.join(" ", words)
                        .replace(" null", "")
        ); */

        /* int[] integers = {1, 4, -6, 0, 4, 100, 0, 5};
        System.out.println(integers[1]);
        // System.out.println(integers[10]);
        integers[1] = 400;
        System.out.println(integers[1]);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < integers.length; i++) {
            builder.append(String.format("%s, ", integers[i]));
        }
        // System.out.println(integers.toString());
        // System.out.println(integers);
        String result = builder.toString();
        System.out.println(result.substring(0, result.length() - 2)); */

        /*final int[] integers = new int[7];
        // integers = null;
        for (int i = 0; i < integers.length; i++) {
            System.out.println(integers[i]);
        }*/

        // TODO добавить цикл, принимающий у пользователя числа из консоли,
        // и собирающий их в массив длиной, указанной самим пользователем выше.
        // После другим циклом вывести в консоль в столбец значения из массива,
        // причем после каждого значения в круглых скобках в той же строке консоли
        // нужно вывести слово "четное" или "нечетное", для этого используйте
        // форматирование строк, деление по модулю на 2 (%) и условное ветвление.

        /* используя два тернарных оператора - второй будет вложен в негативную ветку первого (то есть записан после знака :)
        - измените строку вывода данных о значении ячейки массива так,
        чтобы в круглых скобках вместо надписи "четное" или "нечетное" выводилась надпись "положительное" или "отрицательное" или "ноль" - в зависимости от значения текущей ячейки массива integers[i].*/
   /* Scanner sc = new Scanner(System.in);
        System.out.println("Ведите размер массива - целое число и нажмите ввод");
   int count = sc.nextInt();
        final int[] integers = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.printf("Ведите значение номер %s - целое число и нажмите ввод", i + 1);
          integers[i] = sc.nextInt();
        }
        System.out.println("Вы ввели данные:");
        for (int i = 0; i < count; i++) {
            System.out.printf("%s (%s)\n", integers[i], (integers[i] > 0) ? "положительное" : (integers[i] < 0) ? "отрицательное" : "ноль");
        }
    } */

        /* int[][] matrixDemo = {
            {1, 6, 100},
            {-7, 0, 88},
            {356, 9, 1}
        };
        System.out.println(matrixDemo[1][1]);
        matrixDemo[1][1] = 1000;
        System.out.println(matrixDemo[1][1]); */
        // int[][] matrixDemo2 = new int[3][];
        /* int[][] matrixDemo2 = new int[3][3];
        // цикл перемещения по строкам двумерного массива
        for (int i = 0; i < matrixDemo2.length; i++) {
            // System.out.println(matrixDemo2[i]);
            // цикл перемещения по ячейкам текущей строки (то есть текущего подмассива)
            for (int j = 0; j < matrixDemo2[i].length; j++) {
                System.out.printf("%5d", matrixDemo2[i][j]);
            }
            System.out.println();
        } */

        final int rowsCount = 11, columnsCount = 11;
        int[][] table = new int[11][11];
        // цикл заполнения строк
        for (int i = 0; i < rowsCount; i++) {
            // цикл заполнения ячеек текущей строки
            for (int j = 0; j < columnsCount; j++) {
                if (i == 0) {
                    table[i][j] = j;
                } else if (j == 0) {
                    table[i][j] = i;
                } else {
                    table[i][j] = i * j;
                }
            }
        }
        // ...
        for (int i = 0; i < rowsCount; i++) {
            // цикл вывода ячеек текущей строки
            for (int j = 0; j < columnsCount; j++) {
                System.out.printf("%5d", table[i][j]);
            }
            System.out.println();
        }
        // Task
        // Создайте двумерный массив 3х3, в ячейках которого будут храниться результаты
        // вымышленной партии в крестики-нолики:
        // 'X', 'O', '_'
        // и выведите все эти данные в виде таблицы в консоль.
        // char[] chars = new char[] {'A', 'B', 'C'};
        // char[] chars = {'A', 'B', 'C'};
        char[][] chars2D = new char[3][];
        for (int i = 0; i < chars2D.length; i++) {
            final int rowLength = 1 + new Random().nextInt(20); // 1 - 10
            chars2D[i] = new char[rowLength];
            for (int j = 0; j < rowLength; j++) {
                chars2D[i][j] = (char)(65 + new Random().nextInt(26));
            }
        }
        for (int i = 0; i < chars2D.length; i++) {
            for (int j = 0; j < chars2D[i].length; j++) {
                System.out.printf("%2s", chars2D[i][j]);
            }
            System.out.println();
        }
    }

}
