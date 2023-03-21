package Test2;

public class ArrayProcTest {

  static final int STUDENTS = 5;

  public static void main(String[] args) {
    int scores[] = new int[STUDENTS];
    ArrayProc obj = new ArrayProc();
    obj.getValues(scores);
    System.out.println("평균은 = " + obj.getAvg(scores));
  }
}
