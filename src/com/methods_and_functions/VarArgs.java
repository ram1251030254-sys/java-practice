package com.methods_and_functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        multiple(24, 4 ,"ram","parth","vishal");
        }
        static void fun(int ...v){
            System.out.println(Arrays.toString(v));
    }
    static void multiple(int a , int b ,String...g){
        System.out.println(Arrays.toString(g));

    }
}
