package Test;

class Box {

  int width;
  int length;
  int height;

  Box() {}

  Box(int argWidth, int argLength, int argHeight) {
    width = argWidth;
    length = argLength;
    height = argHeight;
  }

  public String toString() { // overriding
    return (
      "가로, 세로, 높이는 " + width + ", " + length + ", " + height + "입니다."
    );
  }
}

public class BoxTest {

  public static void main(String args[]) {
    Box box1 = new Box(20, 20, 30);

    System.out.println(box1);
  }
}
