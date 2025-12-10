package org.example;

import java.util.LinkedList;

public class Example2 {
  public static void main(String[] args) {
   LinkedList<Integer> list = new LinkedList<>();
   list.add(1);
   list.add(2);
   list.add(3);

   list.remove(0);
   list.remove(Integer.valueOf(3));

   list.clear();

   list.offer(1);
   list.offer(2);
   list.offer(3);
    System.out.println(list.pop());
    System.out.println(list.pop());
    System.out.println(list.pop());
  }
}
