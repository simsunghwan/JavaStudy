package Test;

public class TimeTest {

  public static void main(String args[]) {
    Time t = new Time();
    System.out.println("기본 생성자 호출 후 시간 : " + t);

    Time t2 = new Time(13, 27, 6);
    System.out.println("두번쨰 생성자 호출 후 시간 : " + t2);

    Time t3 = new Time(99, 88, 77);
    System.out.println("올바르지 않은 시간 설정 후 시간 : " + t3);
  }
}
