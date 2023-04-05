package Test4.Day0331;

public class ShapeTest {

  public static void main(String[] args) {
    // Shape s1, s2, s3, s4;
    Shape shapes[] = new Shape[5];

    Shape s = new Shape();
    shapes[0] = s;

    s = new Rectangle();
    shapes[1] = s;

    s = new Triangle();
    shapes[2] = s;

    s = new Circle();
    shapes[3] = s;

    s = new Polygon();
    shapes[4] = s;

    /* 
    s1 = new Shape();
    s2 = new Rectangle();
    s3 = new Triangle();
    s4 = new Circle();

    s1.draw();
    s2.draw();
    s3.draw();
    s4.draw();
    */
    // s2.setX(10);
    // s2.setY(10);
    // 시야 스코프의 차이로 자식객체의 변수,
    // 오버라이딩 하지 않은 메서드는 볼 수 없음
    // s2.setWidth(100);
    // s2.setHeight(100);
  }

  public static void drawShapes(Shape argShapes[]) {
    for (Shape s : argShapes) {
      s.draw();
    }
    /* 위와 아래는 동일한 기능을 한다
      for (int i = 0 ; i < argShapes.length; i++ ) {
      Shape s = shapes[i];
      s.draw();
    } 
    */
  }
}
