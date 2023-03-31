package Test4;

public class Rectangle0330 extends Shape0330 {

  private int width;
  private int height;

  public void setWidth(int argWidth) {
    this.width = argWidth;
  }

  public int getWidth() {
    return width;
  }

  public void setHeight(int argHeight) {
    this.height = argHeight;
  }

  public int getHeight() {
    return height;
  }

  public int area() {
    return width * height;
  }

  public void draw() {
    System.out.println(
      "(" +
      getX() +
      ", " +
      getY() +
      ") 위치에 " +
      "가로 : " +
      width +
      ", 세로 : " +
      height
    );
  }
}
