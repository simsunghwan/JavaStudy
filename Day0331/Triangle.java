package Test4.Day0331;

public class Triangle extends Shape {
  private int width;
  private int height;

  @Override
  public void draw() {
    System.out.println("Triangle Draw [" + width + ", " + height + "]");
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int argWidth) {
    this.width = argWidth;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int argHeight) {
    this.height = argHeight;
  }
}
