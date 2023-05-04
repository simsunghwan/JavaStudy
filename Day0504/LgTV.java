package Day0504;

public class LgTV implements RemoteControl{

  @Override
  public void turnOn() {
    System.out.println("LgTV를 켭니다");

  }

  @Override
  public void turnOff() {
    System.out.println("LgTV를 끕니다");
  }
  
}
