package org.example;

import java.util.ArrayList;

/*
* Reference : https://www.youtube.com/watch?v=viTHc_4XfCA
*/
public class Example {
  public static void main(String[] args) {
    // nao precisa especificar um tamanho, pois eh mutavel
    ArrayList<String> people = new ArrayList<>();
    people.add("Jhon");
    people.add("Dave");
    people.add("Jane");
    people.remove(1);

    if (people.contains("Jon")) {
      System.out.println("Jon is in the list");
    }

    if (people.isEmpty()) {
      System.out.println("The list is empty!");
    }

    people.clear();
    int[] array = new int[100];
  }
}
