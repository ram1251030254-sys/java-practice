package com.methods_and_functions;

import java.util.Scanner;

public class sum_method_with_without_return_type {
    public static void main(String[] args) {
//        int x = sum2();
//        System.out.println(x);
        int ans = sum3(3, 4);
        System.out.println(ans);
    }
    static int sum3(int a, int b){
       int sum = a + b;
       return(sum);
    }
    static int sum2 (){
        Scanner in = new Scanner(System.in);
        System.out.println(" enter a no's ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println(" enter a no's ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("the sum is " + sum);
     }

}
