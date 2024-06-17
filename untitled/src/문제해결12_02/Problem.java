package 문제해결12_02;

import java.util.ArrayList;

class Fruit               { public String toString() { return "Fruit";}}
class Apple extends Fruit { public String toString() { return "Apple";}}
class Toy                 { public String toString() { return "Toy"  ;}}

class Box<T> {
  ArrayList<T> arr = new ArrayList();
  public void add(T fruit) {
    arr.add(fruit);
  }

  public String toString() {
    return String.valueOf(arr);
  }
}

class Problem {
  public static void main(String[] args) {
    Box<Fruit> fruitBox = new Box<Fruit>();
    Box<Apple> appleBox = new Box<Apple>();
    Box<Toy>   toyBox   = new Box<Toy>();
    fruitBox.add(new Fruit());
    fruitBox.add(new Apple());
    appleBox.add(new Apple());
    appleBox.add(new Apple());
    toyBox.add(new Toy());

    System.out.println(fruitBox);
    System.out.println(appleBox);
    System.out.println(toyBox);
  }  // main의 끝
}