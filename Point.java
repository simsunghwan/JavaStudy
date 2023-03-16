package Test;

public class Point {

  private int x, y;

  public Point(int a, int b) {
    x = a;
    y = b;
  }
  // 부모로부터 상속받은 메소드를 재정의 하는것을 오버라이딩이라고 한다
  @Override
  public String toString() {
    return "Point [x=" + x + ",y=" + y + "]";
  }
}
