package com.college_works;

public class palindrome {
    public static void main(String[] args) {
        int i = 3443;
        int count = 0;
        int temp = i;
        while (i>0){

            int rem = i%10;
            count = count*10 + rem;
            i= i/10;
        }
        System.out.println(count);
        if(count == temp){
            System.out.println("the number is palindrome");
        }else{
            System.out.println("the number is not palindrome");
        }

    }
}
