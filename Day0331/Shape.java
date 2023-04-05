package Test4.Day0331;

public class Shape {

  int x;
  int y;

  public void draw() {
    System.out.println("Shape Draw [" + x + ", " + y + "]");
  }

  public int getX() {
    return x;
  }

  public void setX(int argX) {
    this.x = argX;
  }

  public int getY() {
    return y;
  }

  public void setY(int argY) {
    this.y = argY;
  }
}
