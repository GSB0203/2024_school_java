package 문제해결02_01;

import 문제해결02_01.Car;

public class Main {
  public static void main(String[] args) {
    Car car1 = new Car("blue", "1234", "빵빵", true, 50, true);
    Car car2 = new Car("red", "1235", "빵빵", true, 50, false);

    car1.power();
    car1.viewCarNumber();
    car1.viewFix();
    car1.viewEnergy();

    car2.power();
    car2.viewPoewr();
    car2.viewCarNumber();
    car2.viewFix();
    car2.viewEnergy();

  }
}
