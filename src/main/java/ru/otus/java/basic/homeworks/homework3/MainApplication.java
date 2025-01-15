package ru.otus.java.basic.homeworks.homework3;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5");
        int number = scanner.nextInt();
        if (number == 1) {
            greetings();
        } else if (number == 2) {
            checkSign(35, 43, 6);
        } else if (number == 3) {
            selectColor();
        } else if (number == 4) {
            compareNumbers();
        } else if (number == 5) {
            addOrSubtractAndPrint(333, 45, false);
        } else {
            System.out.println("Вы ввели что-то не то - попробуйте снова");
        }
    }

    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor() {
        int data = 30;
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 39;
        int b = 56;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }

}
