package Day0504;

public interface RemoteControl {
  public abstract void turnOn();

  void turnOff();

  /* 
  default void volumeControl(int amount) {
    String st = null;
    st = amount > 0 ? "높입니다." : "줄입니다.";
    amount = Math.abs(amount);
    System.out.println("볼륨을 " + amount + "만큼 " + st);
  } 
  */

}
