package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number ");
        int n = scanner.nextInt();
        System.out.println(writeTrueNumber(n));
    }

    private static boolean checkTrueNumber(int k) {
        int a = k % 10;
        int b = (k / 10) % 10;
        int c = (k / 100) % 10;
        return a == b && b != c || a == c && a != b || b == c && b != a;
    }

    private static int writeTrueNumber(int n) {
        int j = 0;
        for (int i = 100; i <= 999; i++) {
            if (checkTrueNumber(i)) {
                j++;
                if (j == n) {
                    return i;
                }
            }
        }
        return 0;
    }

}