package Test4;

public class RectangleTest0330 {

  public static void main(String[] args) {
    Rectangle0330 r1 = new Rectangle0330();
    Rectangle0330 r2 = new Rectangle0330();

    r1.setX(5);
    r1.setY(3);
    r1.setWidth(10);
    r1.setHeight(20);

    r2.setX(8);
    r2.setY(9);
    r2.setWidth(15);
    r2.setHeight(20);

    System.out.println(r1);
    r1.draw();
    System.out.println("------------------------");
    System.out.println(r2);
    r2.draw();
  }
}
