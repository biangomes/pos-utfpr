package org.example;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Example4 {
  public static void main(String[] args) {
    HashMap<String, Integer> populationByCity = new HashMap<>();
    populationByCity.put("New York", 230021);
    populationByCity.put("Las Vegas", 112234);
    populationByCity.put("San Francisco", 113561);

    Integer population = populationByCity.get("New York");

    if (populationByCity.containsKey("New York")) {
      System.out.println("We got New York's population!");
    }

    populationByCity.keySet();
    populationByCity.values();
    populationByCity.entrySet();

    LinkedHashMap<String, Integer> orderedMap = new LinkedHashMap<>();
  }
}
