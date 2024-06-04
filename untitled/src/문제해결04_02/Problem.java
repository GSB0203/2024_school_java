package 문제해결04_02;

public class Problem extends Book{
    String subject;

    public Problem() {
      super();
      this.subject = "주제 없음";
    }

    public Problem(String title, String author, String subject) {
      super(title, author);
      this.subject = subject;
    }

    public void displayInfo() {
      super.displayInfo();
      System.out.println("subject = " + subject);
    }
  }
