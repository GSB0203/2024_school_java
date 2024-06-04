package 문제해결07_02;

public class Samsung implements Phone{

  String name;
  String color;

  public Samsung(String name, String color) {
    this.name = name;
    this.color = color;
  }

  @Override
  public void touch() {
    System.out.println("화면을 터치하였습니다.");
  }

  @Override
  public void volume() {
    System.out.println("볼륨을 조절하였습니다.");
  }

  @Override
  public void photo() {
    System.out.println("사진을 촬영하였습니다.");
  }

  @Override
  public void call() {
    System.out.println("전화를 걸었습니다.");
  }

  @Override
  public void message() {
    System.out.println("문자메시지를 보냈습니다.");
  }

  public void ai() {
    System.out.println("AI 기능을 사용하였습니다.");
  }

  public void samsungPay() {
    System.out.println("삼성페이를 사용하였습니다.");
  }
}
