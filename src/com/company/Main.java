package com.company;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int i1 = 1, i2 = 1;
        System.out.println(i1 + " " + i2);
        System.out.println("Set count  of Fibonacci Array Items:");
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            i1 = i1 + i2; // toplamı kendisinden önce olan sonuncu sayı hesaplanıyor
            System.out.println(i1 + " ");
            i2 = i1 - i2; // hesaplanan sonuncu sayıdan önceki sayı hesaplanıyor
        }
    }
}
