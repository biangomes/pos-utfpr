package org.example;

import java.util.TreeMap;

public class Example5 {
  public static void main(String[] args) {
    TreeMap<String, Integer> sortedMap = new TreeMap<>();
    sortedMap.put("Key 1", 10);
    sortedMap.put("Key 3", 20);
    sortedMap.put("Key 5", 30);
    sortedMap.put("Key 2", 40);

    sortedMap.entrySet().forEach(System.out::println);
  }
}
