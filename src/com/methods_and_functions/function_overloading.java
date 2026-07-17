package com.methods_and_functions;

import java.util.Arrays;

public class function_overloading {
    public static void main(String[] args) {
        fun(2,4 );
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
