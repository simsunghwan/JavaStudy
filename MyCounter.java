package Test2;

public class MyCounter {

  private static int value;

  public static void addOne(int argValue) {
    value = argValue + 1;
  }

  public void setValue(int argValue) {
    this.value = argValue;
  }

  public int getValue() {
    return value;
  }

  public static void increase(MyCounter cntObj) {
    int v = cntObj.getValue() + 1;
    cntObj.setValue(v);
  }

  public static void main(String args[]) {
    // int val = 10;
    // MyCounter.addOne(val);
    // System.out.println(val);

    MyCounter mc = new MyCounter();
    mc.setValue(10);
    MyCounter.increase(mc);
    System.out.println(mc.getValue());
  }
}
