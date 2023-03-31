package Test4;

public class Derived0330 extends Base0330 {

  public Derived0330() {
    // 부모 클래스의 생성자를 명시적으로 호출하지 않으면 묵시적으로 호출된다.
    // 이 때 호출되는 부모클래스의 생성자는 super() 어떤 인자도 가지고 있지 않다.
    //super("a");
    //super();
    System.out.println("Derived 생성자 호출");
  }
}
