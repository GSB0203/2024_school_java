package 문제해결12_03;

import java.util.ArrayList;

class Fruit2 implements Eatable {
  public String toString() { return "Fruit";}
}
class Apple2 extends Fruit2 { public String toString() { return "Apple";}}
class Grape2 extends Fruit2 { public String toString() { return "Grape";}}
class Toy2                 { public String toString() { return "Toy"  ;}}

interface Eatable {}

class problem {
  public static void main(String[] args) {
    FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();
    FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();
    //FruitBox2<Grape2> grapeBox = new FruitBox2<Apple2>();  오류 이유 : T타입 클래스가 달라사
    //FruitBox2<Toy2>   toyBox    = new FruitBox2<Toy2>();  오류 이유 : T타입 클래스를 Fruit2, Eatable로 제한 toyBox는 둘다 행당 X라서

    fruitBox.add(new Fruit2());
    fruitBox.add(new Apple2());
    fruitBox.add(new Grape2());
    appleBox.add(new Apple2());
    //appleBox.add(new Grape2());
    //grapeBox.add(new Grape2());

    System.out.println("fruitBox-"+fruitBox);
    System.out.println("appleBox-"+appleBox);
    //System.out.println("grapeBox-"+grapeBox);
  }  // main
}

class FruitBox2<T extends Fruit2 & Eatable> extends Box2<T> {}

class Box2<T> {
  ArrayList<T> list = new ArrayList<T>();
  void add(T item)  { list.add(item);      }
  T get(int i)      { return list.get(i); }
  int size()        { return list.size();  }
  public String toString() { return list.toString();}
}