package com.startjava.lesson_4;

import java.util.Arrays;

public class Arrays_of_Strings {

    public static void main(String[] args) {
        
        int[] numbers = new int[5];
        numbers[0] = 10;
        System.out.println(numbers[0]);
        
        String[] strings = new String[3];
        strings[0] = "Hello";
        strings[1] = "Java";
        strings[2] = "soon!";

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        for (String str: strings) {
            System.out.println(str);
        }
        int[] numbers1 = {1,2,3};
        int sum = 0;

        for (int num: numbers1) {
            sum = sum + num;
        }
        System.out.println(sum);
    }

}
