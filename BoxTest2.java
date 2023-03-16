package Test;

class Box2 {

  private int width;
  private int length;
  private int height;
  private int volume;

  Box2() {}

  Box2(int argWidth, int argLength, int argHeight) {
    width = argWidth;
    length = argLength;
    height = argHeight;
    volume = width * height * length;
  }

  public int getVolume() {
    return volume;
  }

  @Override
  public String toString() {
    return (
      "가로, 세로, 높이는 " + width + ", " + length + ", " + height + "입니다."
    );
  }
}

public class BoxTest2 {

  public static void main(String args[]) {
    Box2 box1 = new Box2(20, 20, 30);

    System.out.println(box1);
  }
}
