package 문제해결11_02;

import java.util.HashSet;
import java.util.Objects;

public class Problem_2 {
  public static void main(String[] args) {
    HashSet set = new HashSet();

    set.add(new String("abc"));
    set.add(new String("abc"));
    set.add(new Person2("David", 10));
    set.add(new Person2("David", 10));

    System.out.println(set);
  }
}

class Person2 {
  String name;
  int age;

  public Person2(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return name +":" + age;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Person2) {
      return true;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }
}
