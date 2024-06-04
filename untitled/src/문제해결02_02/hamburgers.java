package 문제해결02_02;

import java.util.Objects;

public class hamburgers {

  String bulgogiBurger;
  String cheeseBurger;
  String doubleBurger;

  static int vegetable = 20;
  static int bread = 40;
  static int cheese = 10;
  static int meet = 30;


  public hamburgers() {}
  public hamburgers(String burger) {
    if(Objects.equals(burger, "doubleBurger")) {
      this.doubleBurger = burger;
    }

    else if(Objects.equals(burger, "bulgogiBurger")) {
    this.bulgogiBurger = burger;
    }

    else if(Objects.equals(burger, "cheeseBurger")) {
      this.cheeseBurger = burger;
    }
  }


  void orderBurger(String s) {
    if(Objects.equals(this.bulgogiBurger, "bulgogiBurger")) {
      vegetable--;
      bread -= 2;
      meet--;
    }

    else if(Objects.equals(this.doubleBurger, "doubleBurger")) {
      vegetable -= 2;
      bread -= 2;
      cheese -= 2;
      meet -= 2;
    }

    else if(Objects.equals(this.cheeseBurger, "cheeseBurger")) {
      vegetable--;
      bread -= 2;
      cheese--;
      meet--;
    }
  }

  void viewIngredient() {
    System.out.println("vegetable = " + vegetable);
    System.out.println("bread = " + bread);
    System.out.println("cheese = " + cheese);
    System.out.println("meet = " + meet);
  }

  static hamburgers copy(hamburgers burgers) {
    hamburgers tmp = new hamburgers();
    tmp = burgers;
    return tmp;
  }

  public void viewMeue() {
    if(!Objects.equals(this.cheeseBurger, null)) System.out.println("meue = " + cheeseBurger);
    else if(!Objects.equals(this.doubleBurger, null)) System.out.println("meue = " + doubleBurger);
    else if(!Objects.equals(this.bulgogiBurger, null)) System.out.println("meue = " + bulgogiBurger);
  }
}
