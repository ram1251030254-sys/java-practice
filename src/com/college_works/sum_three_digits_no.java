package com.college_works;

public class sum_three_digits_no {
    public static void main(String[] args) {
        int a = 345;
        int count = 0;
        int sum = 0;
        while( a> 0){
             int rem = a% 10;
             sum += rem;
             a = a/10;



        }
        System.out.println(" the sum of the three digits is " + sum);

    }
}
