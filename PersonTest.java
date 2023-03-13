package Test;

import Test.Person;

public class PersonTest {

  public static void main(String args[]) {
    Person p = new Person();
    p.setName("홍길동");
    p.setAge(20);
    // 변수 값이 열려 있을 경우 악의적, 실수로 잘못 입력하는 값을 막을 수 없음

    System.out.println(p.getName());
    System.out.println(p.getAge());
    System.out.println(p.getDept());
  }
}
