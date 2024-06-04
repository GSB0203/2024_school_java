package 문제해결02_01;

public class Car {

  String color;
  String carNumber;
  String sound;
  boolean power;
  int energy;
  boolean fix;

  public Car(String color, String carNumber, String sound, boolean power, int energy, boolean fix) {
    this.color = color;
    this.carNumber = carNumber;
    this.sound = sound;
    this.power = power;
    this.energy = energy;
    this.fix = fix;
  }

  void power() {
    power = !power;
  }

  void viewPoewr() {
    System.out.println("power = " + power);
  }

  void viewEnergy() {
    System.out.println("energy = " + energy);
  }

  void viewFix() {
    System.out.println("fix = " + fix);
  }

  void viewCarNumber() {
    System.out.println("carNumber = " + carNumber);
  }

  void speakSound() {
    System.out.println("sound = " + sound);
  }


}
