package Test;

public class DateTest {

  public static void main(String args[]) {
    Date d1 = new Date();
    Date d2 = new Date(2000);
    Date d3 = new Date(2000, "7월", 24);
    System.out.println(d1);
    System.out.println(d2);
    System.out.println(d3);
  }
}
