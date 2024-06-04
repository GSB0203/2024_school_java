package 문제해결04_02;

public class Book {
  private final String title;
  private final String author;

  public Book() {
    this("제목 없음", "저자 없음");
  }

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  public void displayInfo() {
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
  }
}