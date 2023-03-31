package Test4;

public class Shape0330 {

  private int x;
  private int y;

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

  @Override
  public String toString() {
    return ("X좌표 : " + x + " Y좌표 : " + y);
  }
}
