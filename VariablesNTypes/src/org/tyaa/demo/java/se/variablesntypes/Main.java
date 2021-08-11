package org.tyaa.demo.java.se.variablesntypes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // System.out.println("Hello Java!");
        /* Primitive types */
        /* int i1 = 10; // инициализация
        int i2; // объявление
        byte b1 = 10; // -128; 127
        short sh1 = 10;
        // long l1 = 10000000000000000;
        long l1 = 10000000000000000L;
        float f1 = 99.99f;
        double d1 = 99.99d;
        d1 = .5;
        char ch1 = 'f';
        boolean boo1 = true;
        boo1 = false; */

        /* Console Input / Output */
        System.out.println("Input the first number:");
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt(); // вызов метода
            System.out.println("Input the second number:");
            int y = sc.nextInt();
            System.out.println("x + y = " + (x + y));
        } catch (Exception ex) {
            System.out.println("Wrong input: x and y must be integer. Finish...");
            System.exit(-1);
        }
        // Task
        // Дописать код программы так, чтобы:
        // - после вывода суммы выводились также разность,
        //, произведение и результат деления х и у.

        // System.out.println(10 / 0);
        System.out.println("Demo: 10 / 2 =");
        System.out.println(10 / 2);
    }
}
