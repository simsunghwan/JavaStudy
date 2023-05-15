package Day0512;

import Day0504.RemoteControl;
import javax.swing.event.SwingPropertyChangeSupport;

public class CallbackTest2 {

  public void remoteControl(RemoteControl rc) {
    rc.turnOn();
  }

  public static void main(String[] args) {
    CallbackTest2 cb = new CallbackTest2();
    // 무명 클래스로 RemoteControl 객체를 인자로 전달하시오.
    // 1. 변수 사용해서 전달
    // 2. 변수 사용하지않고 전달
    // 화면에는 "파나소닉 테레비가 켜졌습니다"

    cb.remoteControl(
      new RemoteControl() {
        @Override
        public void turnOn() {
          System.out.println("파나소닉 테레비 켜짐 변수없음");
        }

        @Override
        public void turnOff() {
          System.out.println("파나소닉 테레비 꺼짐 변수없음");
        }
      }
    );

    RemoteControl rm = new RemoteControl() {
      @Override
      public void turnOn() {
        System.out.println("파나소닉 테레비 켜짐 변수있음");
      }

      @Override
      public void turnOff() {
        System.out.println("파나소닉 테레비 꺼짐 변수있음");
      }
    };

    cb.remoteControl(rm);
  }
}
