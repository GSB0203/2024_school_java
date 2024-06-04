package 문제해결03_02;

public class allergy {
  String allergy;
  int century;

  public allergy() {
    this("NO Allergy", 0);
  }

  public allergy(String allergy, int century) {
    this.allergy = allergy;
    this.century = century;
  }

  void view() {
    System.out.println("allergy = " + allergy);
    System.out.println("century = " + century);
  }
}
