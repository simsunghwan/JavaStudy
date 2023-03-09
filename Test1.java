package Test;

public class Test1 {

  public static void main(String args[]) {
    String proverb = "A barking dog";
    String s1, s2, s3, s4;

    s1 = proverb.concat("never bites");
    System.out.println(s1);

    s2 = proverb.replace('b', 'B');
    System.out.println(s2);

    s3 = proverb.substring(2, 4);

    s4 = proverb.toUpperCase();

    s4 = "200";

    Integer.parseInt(s4);
    Double.parseDouble(s4);
    Float.parseFloat(s4);

    System.out.println(Math.sqrt(2));
  }
}
