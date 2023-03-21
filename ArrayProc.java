package Test2;

import java.util.Scanner;

public class ArrayProc {

  public void getValues(int argArray[]) {
    Scanner scan = new Scanner(System.in);
    for (int i = 0; i < argArray.length; i++) {
      System.out.println("성적을 입력하시오");
      argArray[i] = scan.nextInt();
    }
  }

  public double getAvg(int argArray[]) {
    double total = 0;
    for (int i = 0; i < argArray.length; i++) {
      total += argArray[i];
    }
    return total / argArray.length;
  }
}
