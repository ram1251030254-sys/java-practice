package com.conditions_and_loops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter any lowercase or upper case alphabet for case check: ");
        char ch = in.next().trim().charAt(0);

        if(ch>= 'A'&& ch<= 'Z'){
            System.out.println("it is upper case ");

        }else {
            System.out.println("it is a lowercase");
        }


    }
}
