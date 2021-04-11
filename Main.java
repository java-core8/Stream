package com.tcreator;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        int[] arrs  = { 1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4 };
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int arr : arrs) {
            arrayList.add(arr);
        }

        ArrayList<Integer> prepareArrayList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            int value = arrayList.get(i);
            if(value > 0 && value % 2 == 0) prepareArrayList.add(value);
        }
        prepareArrayList.sort(Comparator.naturalOrder());
        prepareArrayList.forEach(System.out::println);
    }

}

