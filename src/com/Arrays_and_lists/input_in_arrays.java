package com.Arrays_and_lists;

import java.util.Arrays;
import java.util.Scanner;

public class input_in_arrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 87;
        arr[1] = 98;
        arr[2] = 25;
        arr[3] = 9;
        arr[4] = 7;
        System.out.println(arr[0]);
        System.out.println(Arrays.toString(arr));
        System.out.println("enter elements in array");

        for (int i = 0; i < 5; i++){
            arr[i] = in.nextInt();
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        // for-each loop
        for (int num : arr){// for every elements in array , print the element
            System.out.print(num + " ");// here num represents the elements of array
        }
        String[] str = new String[4];
        for(int i = 0; i < str.length; i++){
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));
        str[3] = "krishna";// modifying array
        System.out.println(Arrays.toString(str));
    }
}
