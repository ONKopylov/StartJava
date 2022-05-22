package com.startjava.lesson_4;

import javax.swing.text.View;
import java.util.ArrayList;

public class Arrays {

    public static void main(String[] args) {
        int[] cats = new int[6];
        cats[5] = 7;
        System.out.println(String.valueOf(cats[5]));

        String[] catsNames = {
                "Васька",
                "Кузя",
                "Барсик",
                "Мурзик",
                "Леопольд",
                "Бегемот",
                "Рыжик",
                "Матроскин"
        };

        for (int i = 0; i < catsNames.length; i++) {
            System.out.println(catsNames[i]);
        }

        String[] catsNamesCopy = new String[8];
        System.arraycopy(catsNames, 0, catsNamesCopy, 0,catsNames.length);//CatNames.Arr

        //String[] Arr1 = new String[10];
        //List<String> arr1 = ArrayList(catsNames, "Мур");
        //Arr1 = ArrayList(catsNames, "Мур");

        // Массив строк
        final String[] catNamesArray = new String[] { "Рыжик", "Барсик", "Мурзик",
                "Мурка", "Васька", "Томасина", "Бобик", "Кристина", "Пушок",
                "Дымка", "Кузя", "Китти", "Барбос", "Масяня", "Симба" };

// Применим метод. Ищем по буквам "мур":

        List<String> words = searchFromStart(catNamesArray, "мур");

    }

    // Поиск элементов строкового массива по начальным символам
    public static ArrayList<String> searchFromStart(String[] inputArray, String searchText) {
        ArrayList<String> outputArray = new ArrayList<>();

        for (int i = 0; i < inputArray.length; i++) {
            if (searchText.compareToIgnoreCase(inputArray[i].substring(0,
                    searchText.length())) == 0) {
                outputArray.add(inputArray[i]);
            }
        }
        return outputArray;
    }

}
