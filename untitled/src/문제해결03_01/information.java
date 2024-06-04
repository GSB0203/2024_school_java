package 문제해결03_01;

public class information {
  String name;
  int age;
  String address;

  public information(String name, int age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }

  void search(String name, int age, String address) {
    if (this.name != name || this.age != age || this.address != address) {
      System.out.println("입력된 정보는 없습니다.");
    }
    else {
      System.out.println("name = " + name);
      System.out.println("age = " + age);
      System.out.println("address = " + address);
    }
    }

  void search(String name) {
    if(this.name != name) {
      System.out.println("입력된 정보는 없습니다.");
    }
    else {
      System.out.println("name = " + name);
      System.out.println("age = " + this.age);
      System.out.println("address = " + this.address);
    }
  }

  void search(int age) {
    if(this.age != age) {
      System.out.println("입력된 정보는 없습니다.");
    }
    else {
      System.out.println("name = " + this.name);
      System.out.println("age = " + age);
      System.out.println("address = " + this.address);
    }
  }

}
