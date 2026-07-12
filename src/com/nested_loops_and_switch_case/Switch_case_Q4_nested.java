package com.nested_loops_and_switch_case;

import java.util.Scanner;

public class Switch_case_Q4_nested {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Student_id = in.nextInt();
        String branch = in.next();

        switch (Student_id) {
            case 1:
                System.out.println("student id is 1 ");
                switch (branch) {
                    case "IT":
                        System.out.println("student is from it department");
                        break;
                    case "CS":
                        System.out.println("student is from CS department");
                        break;
                    default:
                        System.out.println("invalid");
                        break;
                }
            break;
            case 2:
                System.out.println("student id is 2 ");
                switch (branch) {
                    case "IT":
                        System.out.println("student is from it department");
                        break;
                    case "CS":
                        System.out.println("student is from CS department");
                        break;
                    default:
                        System.out.println("invalid");
                        break;
                }
            break;
            default:
                System.out.println("invalid");
                break;


        }
    }
}