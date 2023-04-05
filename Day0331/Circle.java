package Test4.Day0331;

public class Circle extends Shape {
  private int radius;

  @Override
  public void draw() {
    System.out.println("Circle Draw [" + radius + "]");
  }

  public int getRadius() {
    return radius;
  }

  public void setRadius(int argRadius) {
    this.radius = argRadius;
  }
}
