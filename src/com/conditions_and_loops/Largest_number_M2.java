package com.conditions_and_loops;

import java.util.Scanner;

public class Largest_number_M2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter three numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        System.out.println(max);

    }
}
