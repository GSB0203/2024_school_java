package 문제해결03_01;

public class Main {
  public static void main(String[] args) {
    information user1 = new information("GSB", 18, "ChanWon");
    information user2 = new information("PKW", 18, "ChanWon");

    user1.search("GSB");
    user1.search("GSB", 18, "ChanWon");
    user1.search(18);
    user1.search("Busan");

    user2.search(17);
  }
}