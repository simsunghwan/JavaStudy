package Day0504;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.Timer;

class MyClass implements ActionListener {

  @Override
  public void actionPerformed(ActionEvent event) {
    System.out.println("beep");
  }
}

public class CallbackTest {

  public static void main(String args[]) {
    ActionListener listener = new MyClass();

    Timer timer = new Timer(1000, listener);
    timer.start();

    Scanner scan = new Scanner(System.in);
    System.out.println("Press Enter to quit");
    scan.nextLine();
    scan.close();
    System.out.println("프로그램을 종료합니다");
    for (int i = 0; i < 1000; i++) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println(e);
      }
    }
  }
}
