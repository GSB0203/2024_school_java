package 문제해결10_02;

import java.util.Stack;

public class BackAndForward {
  public static void main(String[] args) {
    Stack back = new Stack();
    Stack forward = new Stack();

    back.push("1.네이트");
    back.push("2.야후");
    back.push("3.네이버");
    back.push("4.다음");

    System.out.println("back:" + back);
    System.out.println("forward:" + forward);
    System.out.println("현재화면은 " + back.peek() + " 입니다.");
    System.out.println();

    forward.push(back.pop());
    System.out.println("= '뒤로가기' 버튼을 누른 후 =");
    System.out.println("back:" + back);
    System.out.println("forward:" + forward);
    System.out.println("현재화면은 " + back.peek() + " 입니다.");
    System.out.println();

    forward.push(back.pop());
    System.out.println("= '뒤로가기' 버튼을 누른 후 =");
    System.out.println("back:" + back);
    System.out.println("forward:" + forward);
    System.out.println("현재화면은 " + back.peek() + " 입니다.");
    System.out.println();

    back.push(forward.pop());
    System.out.println("= '앞으로' 버튼을 누른 후 =");
    System.out.println("back:" + back);
    System.out.println("forward:" + forward);
    System.out.println("현재화면은 " + back.peek() + " 입니다.");
    System.out.println();

    back.push("codechobo.com");
    forward.pop();
    System.out.println("= 새로운 주소로 이동 후 =");
    System.out.println("back:" + back);
    System.out.println("forward:" + forward);
    System.out.println("현재화면은 " + back.peek() + " 입니다.");
    System.out.println();
  }
}
