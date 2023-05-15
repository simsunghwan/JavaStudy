package Day0512;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.Timer;

/* 🚩 public class 🚩 */
public class Test {

  public static void main(String[] args) {
    ActionListener beef = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("ぴポぴポ!@#!@#!@#!@~~~~~");
      }
    };

      // javax.swing.Timer 클래스의 객체를 생성하기 위해서는
      // int 타입의 delay, javax.awt.event.ActionListener 인터페이스 타입의 객체를 
      // 넘겨줘야 한다
      // 두 번째 인자인 저 객체를 넘겨주기 위해서는 아래의 두 가지 방법 중 하나를 사용 하면된다
      // 저 인터페이스를 구현하는 클래스를 정의하고 , 그 클래스의 객체를 생성해 넘겨준다
      // 저 인터페이스르 구현하는 클래스를 무명클래스로 정의한다
      // 무명클래스 클래스 정의와 객체 생성이 하나의 문장으로 해결되는 것
    Timer timer = new Timer(1000, beef); // awt에 있는
    timer.start();

    Scanner input = new Scanner(System.in);
    System.out.println("文字を入力してねん！");
    input.nextLine();
    input.close();
    System.out.println(input.nextLine());


  }
}
