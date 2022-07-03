package com.startjava.lesson_4;

import com.sun.source.tree.IfTree;

import java.util.Arrays;
import java.util.function.IntFunction;

public class ArrayTheme {

    public static void main(String[] args) {

        //1. Реверс значений
        int[] arr = {1,2,3,4,5,6,7};
        int[] reverseArr = new int[7];

        showIntArray(arr);

        System.out.println();
        //int[] arr2 = new int[7];
        for (int i = (arr.length - 1); i >=0; i--) {
            reverseArr[arr.length - 1 - i] = arr[i];
        }

        showIntArray(reverseArr);

        //2. Вывод произведения элементов массива
        int[] arr1 = new int[10];
        int prod = 1;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
        }

        for (int num: arr1) {
            if (num == 0 || num == 9){
                continue;
            }
            prod = prod*num;
        }
        System.out.println();
        System.out.println(prod);

        //3.Удаление элементов массива
        System.out.println("3.Удаление элементов массива");
        double[] arr3 = new double[15];
        double[] arr4 = new double[15];

        for (double num: arr3) {
            num = 1d;
        }
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = Math.random();
            System.out.print(arr3[i] + " ");
        }

        System.out.println();

        double averageNum = arr3[8];
        int qZero;

        System.out.println("averageNum: " + averageNum);

        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] > averageNum){
                arr4[i] = 0d;
            } else {
                arr4[i] = arr3[i];
            }
        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr4[i] + " ");
        }

        System.out.println();
        System.out.println("4.Вывод элементов массива лесенкой в обратном порядке");

        char[] arrChar = new char[10];

        for (int i = 0; i < 10; i++) {
            arrChar[i] = (char) (i+81);
        }

        for (int i = (arrChar.length - 1); i >= 0; i--) {

            for (int j = (arrChar.length - 1); j >= i; j--) {
                System.out.print(arrChar[j]);
            }

            System.out.println();
        }

        System.out.println("5.Генерация уникальных чисел");
        int[] arrInt = new int[40];
        int newElem;

        for (int i = 0; i < arrInt.length; i++) {
            do {
                newElem = 60 + ((int)(Math.random()*40));
            } while (elemInArray(newElem, arrInt));
            arrInt[i] = newElem;
        }

        showIntArray(arrInt);

    }

    static void  showIntArray(int[] arr) {
        for (int num: arr) {
            System.out.print(num + " ");
        }
    }

    static void showDoubleArray(double[] arr) {
        for (double num: arr) {
            System.out.print(num + " ");
        }
    }

    static boolean elemInArray (int elem, int[] array) {
        boolean res = false;
        for (int num: array) {
            if (num == elem){
                res = true;
                break;
            }
        }
        return  res;
    }

}
