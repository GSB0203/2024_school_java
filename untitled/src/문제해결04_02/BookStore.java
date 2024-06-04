package 문제해결04_02;

public class BookStore{
  Major major;
  Problem problem;

  public BookStore() {
    this(new Problem(), new Major());
  }

  public BookStore(Problem problem, Major major) {
    this.problem = problem;
    this.major = major;
  }

  public void displayInfo() {
    System.out.println("Bookstore Information : ");
    System.out.println("problem : ");
    problem.displayInfo();
    System.out.println("major : ");
    major.displayInfo();

  }
}
