package com.java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Please type a number :");
            int number = input.nextInt();
            if (number < 0) {
                break;
            }
            if (number % 4 == 0) {
                sum += number;
            }

        }

        System.out.print("Total is " + sum);
    }
}
