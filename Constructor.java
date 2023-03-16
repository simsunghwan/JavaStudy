package Test;

public class Constructor {

  /* class 내부에 작성하는 특별한 method
   * 모든 클래스에 반드시 1개 이상 존재
   * 개발자가 구현하지 않는다면 기본으로 자동 생성된다
   * class의 instance를 생성할 때 자동호출
   */
  /* 클래스 이름과 동일 리턴 타입x
   * (변수에다 주소값을 넣기 때문에 반환값이 있을 수 없다)
   * 생성자를 private으로 하고 생성자를 호출할 경우 에러
   */
  /* 생성자에서 다른 생성자를 호출 할수 있다
   * this 키워드를 통해 다른 생성자 호출 가능
   * 
  */
  private String name;
  private int birthYear;
  private String dept;
  private String address;

  public Constructor() {}

  public Constructor(
    String argName,
    int argBirthYear,
    String argDept,
    String argAddress
  ) {
    name = argName;
    birthYear = argBirthYear;
    dept = argDept;
    address = argAddress;
  }
}
