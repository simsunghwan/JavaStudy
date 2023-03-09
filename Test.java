package Test;

public class Test {

  public static void main(String args[]) {
    String s1 = "동해물과 백두산이";
    String s2 = "동해물과 백두산이";
    boolean r = s1 == s2;
    String s3 = new String("동해물과 백두산이");

    System.out.println(r);
    r = s2 == s3;
    System.out.println(r);
  }
}
