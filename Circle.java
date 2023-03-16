package Test;

public class Circle {

  private int radius;
  private Point center;

  public Circle(Point p, int r) {
    center = p;
    radius = r;
  }

  @Override
  public String toString() {
    return "Circle [radius=" + radius + ",center=" + center + "]";
  }

  public static void main(String args[]) {
    Point p = new Point(10, 15);
    Circle c = new Circle(p, 10);
    System.out.println(p);
    System.out.println(c);
  }
}
