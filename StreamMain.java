package com.tcreator;
import java.util.ArrayList;

public class StreamMain {
  public static void main(String[] args) {
    int[] arrs  = { 1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4 };
    ArrayList<Integer> arrayList = new ArrayList<>();
    for (int arr : arrs) {
      arrayList.add(arr);
    }

    arrayList.stream()
            .filter(x -> x > 0)
            .filter(x -> x % 2 == 0)
            .sorted()
            .forEach(System.out::println);
  }
}
