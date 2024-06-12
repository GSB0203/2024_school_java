package 문제해결11_01;

import java.util.ArrayList;
import java.util.Iterator;

public class Problem_2 {
  public static void main(String[] args) {
    ArrayList original = new ArrayList();
    original.add("0");
    original.add("1");
    original.add("2");
    original.add("3");
    original.add("4");
    original.add("5");
    original.add("6");
    original.add("7");
    original.add("8");
    original.add("9");

    ArrayList copy1 = (ArrayList) original.clone();
    System.out.println(original);
    System.out.println(copy1);

    System.out.println();

    ArrayList copy2 = new ArrayList();
    Iterator it = original.iterator();

    while (it.hasNext()) {
      copy2.add(it.next());
      it.remove();
    }

    System.out.println(original);
    System.out.println(copy2);
  }
}
