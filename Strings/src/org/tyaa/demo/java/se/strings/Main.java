package org.tyaa.demo.java.se.strings;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // int x = 1;
        // String s1 = "Hello";

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

        /* String s3 = new String("Привет, Мир!");
        String s4 = new String("Привет, Мир!");
        System.out.printf("s3 == s4 -> %s\n", s3 == s4);
        System.out.printf("s3 value == s4 value -> %s\n", s3.equals(s4)); */

        // var s = "   Привет, Мир!\n".trim(); // \t \r
        // var s = "   \nПривет,\nМир!\n";
        // System.out.println(s.contains("!"));
        // System.out.println(s.contains("\n"));

        // var s = "   \nПривет,\nМир!";
        // System.out.println(s.endsWith("\n"));

        // var s = "   \nПривет,\nМир!";
        // System.out.println(s.replace('!', '.'));
        /* System.out.println(
            s.replace("Привет,", "Hello")
                .replace("Мир", "World")
        ); */

        /* String s1 = "Text";
        String s2 = "";
        String s3 = "   ";
        // s = null;
        System.out.printf("isEmpty: s1 -> %s, s2 -> %s, s3 -> %s\n", s1.isEmpty(), s2.isEmpty(), s3.isEmpty());
        System.out.printf("isBlank: s1 -> %s, s2 -> %s, s3 -> %s\n", s1.isBlank(), s2.isBlank(), s3.isBlank()); */

        /* char ch = 'A';
        for (int i = 0; i < 26; i++) {
            System.out.printf("%s ", ch++);
        } */

        /* String s1 = "demo.some text.txt";
        // 1: получить индекс позиции знака "точка" в строке s1
        int dotIndex = s1.lastIndexOf('.');
        // 2: создать копию части строки s1, расположенной после последней точки
        System.out.println(s1.substring(dotIndex + 1)); */

        /* long freeMemory = Runtime.getRuntime().freeMemory();
        String inputText = "";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Input the next word or 'end' for exit:");
            String word = sc.nextLine();
            if (word.equals("end")) {
                break;
            }
            inputText += word + " ";
        } while (true);
        System.out.println("Text: " + inputText);
        System.out.printf("Free memory: %s\n", Runtime.getRuntime().freeMemory() - freeMemory); */
        // -2092360

        /* long freeMemory = Runtime.getRuntime().freeMemory();
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Input the next word or 'end' for exit:");
            String word = sc.nextLine();
            if (word.equals("end")) {
                break;
            }
            sb.append(word).append(" ");
        } while (true);
        System.out.println("Text: " + sb.toString());
        System.out.printf("Free memory: %s\n", Runtime.getRuntime().freeMemory() - freeMemory);
        // -1587992 */
        /* long freeMemory = Runtime.getRuntime().freeMemory();
        String inputText = "";
        for (int i = 0; i < 100000; i++) {
            inputText += " some word ";
        }
        System.out.println("Text: " + inputText);
        System.out.printf("Free memory: %s\n", Runtime.getRuntime().freeMemory() - freeMemory); */
        // 690452768

        long freeMemory = Runtime.getRuntime().freeMemory();
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 100000; i++) {
            sb.append(" some word ");
        }
        System.out.println("Text: " + sb.toString());
        System.out.printf("Free memory: %s\n", Runtime.getRuntime().freeMemory() - freeMemory);
        // -8319800
    }
}
