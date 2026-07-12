package com.nested_loops_and_switch_case;

import java.util.Scanner;

public class Switch_case_Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in );
        String fruit = in.next();

        switch (fruit){
            case "mango":
                System.out.println("king of fruits");
                break;
            case "orange":
                System.out.println("orange fruit");
                break;
            default:
                System.out.println("invalid input");
                break;
        }
    }
}
