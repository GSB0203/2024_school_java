package 문제해결11_02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Problem_1 {
  public static void main(String[] args) {
    Set set = new HashSet();
    for (int i = 0; set.size() < 25; i++) {
      int num = (int) (Math.random() * 50) + 1;
      set.add(new Integer(num));
    }
    System.out.println(set);

    Iterator it = set.iterator();
    for(int i=1;it.hasNext();i++) {
      System.out.print(it.next() + " ");
      if(i % 5 == 0) System.out.println();
    }
  }
}
