package com.college_works;

import java.util.Scanner;

public class even_or_odd {
    public static void main(String[] args) {
        //int a = 3;
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num% 2 == 0){
            System.out.println("the number is even ");
        }else{
            System.out.println("the number is odd");
        }
    }
}
