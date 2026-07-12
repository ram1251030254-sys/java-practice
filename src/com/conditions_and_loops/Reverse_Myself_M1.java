package com.conditions_and_loops;

import java.util.Scanner;

public class Reverse_Myself_M1 {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in);
        int n = 23597;
        //int count = 0;
        while(n > 0 ){
            int rem = n%10;
            System.out.print(rem);
            //count++;
            n= n/10;
        }

    }
}
