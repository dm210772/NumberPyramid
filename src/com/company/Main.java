package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = input.nextInt();

        for (int i = 1; i <= num; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j);
            }

            System.out.println();
        }

        for (int i = num - 1; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
