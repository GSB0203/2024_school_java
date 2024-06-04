package 문제해결04_02;

public class Main {
  public static void main(String[] args) {
    BookStore bookstore = new BookStore();
    bookstore.displayInfo();

    BookStore bookstore2 = new BookStore(new Problem("수학의 정석", "홍성대", "일반"), new Major("JAVA의 정석", "남궁석", "전공"));
    bookstore2.displayInfo();
  }
}
