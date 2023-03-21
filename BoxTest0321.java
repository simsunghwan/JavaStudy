package Test2;

public class BoxTest0321 {

  public static void main(String args[]) {
    Box0321 obj1 = new Box0321(10, 30, 50);
    Box0321 obj2 = new Box0321(10, 30, 50);
    System.out.println("obj1 == obj2 : " + obj1.isSameBox(obj2));
  }
}
