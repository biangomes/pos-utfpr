package org.example;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Example3 {
  public static void main(String[] args) {
    PriorityQueue<Integer> queue = new PriorityQueue<>();
    queue.offer(4);
    queue.offer(5);
    queue.offer(1);

    System.out.println(queue.poll());
    System.out.println(queue.poll());

    PriorityQueue<UserProfile> usersQueue = new PriorityQueue<>(
        Comparator.comparing((UserProfile u) -> u.getLevel())
    );

    usersQueue.offer(new UserProfile(20, "Jr"));
    usersQueue.offer(new UserProfile(30, "Pl"));
    usersQueue.offer(new UserProfile(40, "Sr"));

    System.out.println(usersQueue.poll().level);
  }

  static class UserProfile {
    private final Integer age;
    private final String level;
    public UserProfile(Integer age, String level) {
      this.age = age;
      this.level = level;
    }
    public Integer getAge() {
      return age;
    }
    public String getLevel() {
      return level;
    }
  }


}
