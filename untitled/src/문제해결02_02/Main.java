package 문제해결02_02;

import java.util.Scanner;

import static 문제해결02_02.hamburgers.copy;

public class Main {
  public static void main(String[] args) {
    hamburgers[] hamburgers = new hamburgers[4];
    Scanner scanner = new Scanner(System.in);


    for(int i=0;i<hamburgers.length - 1;i++) {
      hamburgers[i] = new hamburgers(scanner.nextLine());
      hamburgers[i].orderBurger(scanner.nextLine());
      hamburgers[i].viewIngredient();
    }

    hamburgers[3] = copy(hamburgers[2]);
    hamburgers[3].viewMeue();
  }
}
