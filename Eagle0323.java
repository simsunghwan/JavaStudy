package Test3;

public class Eagle0323 extends Animal0323 {

  private int wings = 2;

  public int getWings() {
    return wings;
  }

  public void setWings(int argWings) {
    this.wings = argWings;
  }

  public void fly() {
    System.out.println("fly()가 호출되었음");
  }
}
