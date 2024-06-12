package 문제해결11_03;

import java.util.*;

class Problem_1 {
  public static void main(String[] args) {
    TreeSet set = new TreeSet();

    for (int i = 0; set.size() < 10 ; i++) {
      int num = (int)(Math.random()*100) + 1;
      //System.out.println(num + " ");
      set.add(num);  // set.add(new Integer(num));
    }

    System.out.println("50 이하:" + set.headSet(new Integer(50)));
    System.out.println("50 이상:" + set.tailSet(new Integer(50)));
  }
}