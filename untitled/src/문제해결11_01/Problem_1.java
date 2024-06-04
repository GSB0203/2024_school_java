package 문제해결11_01;

import java.util.*;

class Problem_1 {
  public static void main(String[] args) {
    ArrayList list = new ArrayList();
    list.add("10");
    list.add("20");
    list.add("30");
    list.add("40");
    list.add("50");

    ListIterator it = list.listIterator();
    while(it.hasNext()) {
      Object obj = it.next();
      System.out.print(obj + " ");
    }
    System.out.println();

    while(it.hasPrevious()) {
      Object obj = it.previous();
      System.out.print(obj + " ");
    }
  } // main
}