package 문제해결03_02;

public class Main {
  public static void main(String[] args) {
    allergy user1 = new allergy();
    allergy user2 = new allergy("Dust Allergy", 5);

    user1.view();
    user2.view();
  }
}
