package org.tyaa.demo.java.se.strings;

public class Main {

    public static void main(String[] args) {
        int x = 1;
        String s1 = "Hello";

        /* int y = x;
        y++;
        System.out.printf("x = %s; y = %s\n", x, y);

        String s2 = s1;
        System.out.printf("s1 == s2 -> %s\n", s1 == s2);
        s2 += " Java!";
        System.out.printf("s1 = %s; s2 = %s\n", s1, s2);
        System.out.printf("s1 == s2 -> %s\n", s1 == s2);

        System.out.printf("s1 value == s2 value -> %s\n", s1.equals(s2)); */

        /* String s3 = "Привет, Мир!";
        String s4 = "Привет, Мир!";
        System.out.printf("s3 == s4 -> %s\n", s3 == s4);
        System.out.printf("s3 value == s4 value -> %s\n", s3.equals(s4)); */

        String s3 = new String("Привет, Мир!");
        String s4 = new String("Привет, Мир!");
        System.out.printf("s3 == s4 -> %s\n", s3 == s4);
        System.out.printf("s3 value == s4 value -> %s\n", s3.equals(s4));
    }
}
