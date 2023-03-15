package Test;

public class SafeArray {

  private int a[];

  public void crateArray(int argSize) {
    a = new int[argSize];
  }

  public int get(int argIndex) {
    if (argIndex >= 0 && argIndex < a.length) {
      return a[argIndex];
    }
    System.out.println("잘못된 인덱스 " + argIndex);
    return -1; // 인덱스 값으로 올 수 없는 값을 리턴한다
  }

  public void put(int argIndex, int argValue) {
    if (argIndex >= 0 && argIndex < a.length) {
      a[argIndex] = argValue;
      return;
    }
    System.out.println("잘못된 인덱스 " + argIndex);
  }

  public static void main(String args[]) {
    SafeArray array = new SafeArray();
    array.crateArray(10);
    array.put(2, 100);
    array.put(10, 200);
    //
    System.out.println(array.get(2));
  }
}
