package 문제해결04_02;

public class Major extends Book {
  String subject;

  public Major() {
    super();
    this.subject = "주제 없음";
  }

  public Major(String title, String author, String subject) {
    super(title, author);
    this.subject = subject;
  }

  public void displayInfo() {
    super.displayInfo();
    System.out.println("subject = " + subject);
  }
}
