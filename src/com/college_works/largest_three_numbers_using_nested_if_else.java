package com.college_works;

import java.util.Scanner;

public class largest_three_numbers_using_nested_if_else {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if( a > b && a > c) {
            System.out.println("largest of three is " + a);
        }else{if(b > a && b > c){
                System.out.println("largest of three is " + b);
            }else{
                System.out.println("largest of three is " + c);
            }
        }


    }
}
