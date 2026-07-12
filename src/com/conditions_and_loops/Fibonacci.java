package com.conditions_and_loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int previous = 0;
        int current = 1;
        int count = 2;

        if (n == 1) {
            System.out.println("number is 0");
        } else {
            while (count <= n) {
                int temp = current;
                current = current + previous;
                previous = temp;
                count++;
            }
            System.out.println("number is : " + current);
        }
    }
}
