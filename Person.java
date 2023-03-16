package Test;

public class Person {
    
  /* 특별한 이유가 없는 경우 변수는 private을 통해 외부에 공개하지 않는다
   * member variable을 클래서 외부에서 접근해야 한다면 그를 위한
   * method를 public으로 구현한다
   * 예를 들어, age라는 member variable에 값을 설정해야 한는 메소드는
   * setAge로 member variable의 값을 읽어오는 메소드는 getAge로
   * public 접근제어자를 명시하여 구현하면 된다
   * 이렇게 함으로써 member variable에 잘못된 값이 설정되는 것을 막을 수도 있고
   * 향후에 그 클래스를 버전업하면서 member variable의 이름을 수정하여도
   * 그 클래스를 사용하는 외부 클래스에는 영향을 미치지 않을 수 있다
   */
  /*
   * 접근 제어자 (access modifier)
   * public  protected  (default)  private
   * public     어디서든 접근 가능
   * protected  같은 패키지 또는 상속받은 클래스에서 접근 가능
   * (default)  같은 패키지 내부에 속한 클래스에서 접근 가능
   * private    같은 클래스 내부에서만 접근 가능
   */
  /*
   * 접근제어자가 명시되지 않은 경우 default 접근제어자이다
   * default 접근제어자가 명시도니 member는 그 클래스가 속한 패키지
   * 내부 클래스에서 사용 가능하다
   */
  /* 멤버 변수를 private으로 설정하는 이유
   * 1. 잘못된 값을 설정하는 것을 막아줄 필요가 있다.
   * 2. 읽기 전용 멤버변수로 만들 수 있다
   * 클래스 소스코드를 업그레이드할 경우, 그 클래스를 사용하는 
   * 다른 코드에 미치는 영향을 최소화 할 수 있다
   */
  private String name;
  private int age;
  private String dept = "컴정";

  public void setName(String argName) {
    name = argName;
  }

  public void setAge(int argAge) {
    if (argAge > 0 && argAge <= 150) {
      age = argAge;
    }
    System.out.println("나이의 범위는 0부터 150입니다");
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getDept() {
    return dept;
  }
}
