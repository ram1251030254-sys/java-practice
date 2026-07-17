package com.methods_and_functions;

import java.util.Scanner;

public class greetings_method {
    public static void main(String[] args) {
//        String greet = greeting();
//        System.out.println(greet);
        Scanner in = new Scanner(System.in) ;
        String name = in.nextLine();
        String greet3 = greeting3(name);
        System.out.println(greet3);
    }
    static String greeting3(String greet1){
    String greet2 = "hello "  +  greet1;
    return greet2;
    }
    static String greeting(){
        String greets = "hello ram";
        return(greets);

    }
    static void greeting2(){
        System.out.println("hello ram");
    }

}
