package 문제해결10_02;

import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class Right {
  public static void main(String[] args) {
    Stack stack = new Stack();
    Scanner sc = new Scanner(System.in);

    while (true) {
      String t = sc.next();
      if (Objects.equals(t, "(")) stack.push(t);
      else if (Objects.equals(t, ")")) {
        if (stack.empty()) {
          System.out.println("false");
          return;
        } else stack.pop();
      } else break;
    }
    if(stack.empty()) System.out.println("true");
      else System.out.println("false");
  }
}
