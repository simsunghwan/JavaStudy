package Test;

import java.util.Scanner;

public class StringTest1 {

  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    while (true) {
      System.out.println("문자열을 입력하세요.");
      String inputStr = scan.next();
      if (inputStr.equals("quit")) {
        break;
      }
      if (inputStr.matches("^www\\.(.+)")) {
        System.out.println(inputStr + " 은 www로 시작합니다.");
      } else {
        System.out.println(inputStr + "은 www로 시작하지 않습니다");
      }
    }
  }
}
