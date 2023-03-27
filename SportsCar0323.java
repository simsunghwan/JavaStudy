package Test3;

public class SportsCar0323 extends Car0323 {

  boolean turbo;

  public void setTurbo(boolean flag) {
    turbo = flag;
  }

  public boolean isTurbo() {
    return turbo;
  }

  @Override
  public String toString() {
    return ("speed[" + getSpeed() + "], turbo[" + isTurbo() + "]");
  }
}
