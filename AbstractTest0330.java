package Test4;

import Test.Rectangle;

public class AbstractTest0330 {
  public static void main(String[] args) {
    
    
    // AbsShape0330 abs = new AbsShape0330();
    AbsRectangle0330 r = new AbsRectangle0330();
    AbsCircle0330 c = new AbsCircle0330();
    AbsTriangle0330 t = new AbsTriangle0330();

    r.draw();
    r.move(10,20);
    c.draw();
    c.move(20,30);
    t.draw();
    t.move(30, 40);

  }
}
