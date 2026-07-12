package com.conditions_and_loops;

import java.util.Scanner;

public class Largest_number_M3_M4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max( c, Math.max( a,b));// Shortest and best method.
        // new concept done....

        System.out.println("largest number is: " + max);

    }
    /*
    // method 4th
     int max = 0;
     if(a > b){
        max = a;
     }else {
        max = b;
     }
     if ( c > max ){
        max = c
     }
     sout.....
     */
}
