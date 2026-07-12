package com.conditions_and_loops;

import java.util.Scanner;

public class Counting_Occurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 23333;
        int count = 0;

        while(n > 0){
            int rem = n % 10;
            if (rem == 3){
                count++;
            }
            n=n/10; // n /=10
        }
        System.out.println(count);
    }
}
