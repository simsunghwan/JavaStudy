package Day0602;

public class IntBox {
  // 기초자료형 int의 wrapper class
  private Integer value;

  public void setValue(int value) {
    this.value = value;
  }

  public Integer getValue() {
    // value = 3; // 자동으로 int 값을 Integer 값으로 변환, Auto Boxing
    // int v = value; // 자동으로 integer 값을 int 값으로 변환, Auto UnBoxing
    return value;
  }
  
}
