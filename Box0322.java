package Test3;

public class Box0322 {

  int width;
  int length;
  int height;

  Box0322(int w, int l, int h) {
    width = w;
    length = l;
    height = h;
  }

  /*
   * 인자로 주어지는 Box 객체와 동일한 너비와 높이를 가지는
   * Box인지 체크하는 메서드
   * 같으면 true 다르면 false
   */
  boolean isSameBox(Box0322 argObj) {
    /*
     * 나의 width, length, height가 인자로 주어진 box의 그것과 모두 같으면
     * true를 반환 아니면 false로 반환
     */
    if (
      (argObj.width == width) &&
      (argObj.length == length) &&
      (argObj.height == height)
    ) {
      return true;
    }
    return false;
  }

  public int getVolume() {
    return width * length * height;
  }

  public static Box0322 whoIsLagerBox(Box0322 box1, Box0322 box2) {
    if (box1.getVolume() > box2.getVolume()) {
      return box1;
    }
    return box2;
  }

  public static void main(String args[]) {
    Box0322 b1 = new Box0322(10, 20, 50);
    Box0322 b2 = new Box0322(10, 20, 30);
    Box0322 lagerBox = Box0322.whoIsLagerBox(b1, b2);

    boolean result = b1.isSameBox(b2);
    System.out.println("박스1과 박스2는 같다? : " + result);
    System.out.println("더 큰 박스의 부피는 " + lagerBox.getVolume());
    
  }
}
