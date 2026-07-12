package com.conditions_and_loops;

import java.util.Scanner;

public class Largest_number_M1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any three numbers to find the greatest among them: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("greatest among the given numbers is " + a);
        }else if (b > c && b > a){
            System.out.println("greatest among the given numbers is " + b);
        }else{
            System.out.println("greatest among the given numbers is " + c);
        }

    }

}
        // largest of the three numbers







