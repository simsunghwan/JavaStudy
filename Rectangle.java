package Test;

public class Rectangle {

  private int x, y;
  private int width, height;

  public Rectangle(int argX, int argY, int argWidth, int argHeight) {
    this.x = argX;
    this.y = argY;
    width = argWidth;
    height = argHeight;
  }

  public Rectangle(int argWidth, int argHeight) {
    this(0, 0, argWidth, argHeight);
    /* this 를 통해 다른 생성자를 호출할 경우 항상 첫번째로 나와야한다
     * 다른게 먼저 올 경우 에러 발생
     */
  }

  public static void main(String args[]) {
    Rectangle r = new Rectangle(10, 20);
  }
}
