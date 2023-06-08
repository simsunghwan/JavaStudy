package Day0530_Day0601;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;

public class lambdaTest {

  public static void main(String[] args) {
    LocalDate birthDate1 = LocalDate.of(2000, 1, 4);
    LocalDate birthDate2 = LocalDate.of(1996, 2, 12);
    LocalDate birthDate3 = LocalDate.of(1998, 5, 31);
    Person p1 = new Person("고길동", birthDate1, Sex.MALE, "gdhong@gmail.com");
    Person p2 = new Person("일지매", birthDate2, Sex.FEMALE, "gmil@gmail.com");
    Person p3 = new Person("박문수", birthDate3, Sex.MALE, "mspark@gmail.com");

    // List 는 인터페이스, 이 인터페이스를 구현하는 클래스로
    // Array.List, LinkedList 등이 있다
    // Person 타입의 객체를 원소로 가질 수 있는 리스트를 생성
    List<Person> list = new ArrayList<>();
    list.add(p1);
    list.add(p2);
    list.add(p3);

    // 고길동 : 23세
    // 일지매 : 28세
    // 박문수 : 35세

    // System.out.println(p1.getAge());

    printPersonsWithinAgeRange(list, 20, 30);

    // printPersons(list, new CheckPerson18to25());

    // printPersons(list, new CheckPerson() {
    //     public boolean test(Person p) {
    //         return p.getGender() == Sex.MALE && p.getAge() >= 18 && p.getAge() <=25;
    //     }
    // });

    // CheckPerson 인터페이스를 implements 하는 클래스를 하나 생성해서
    // printPerson 메소드를 호출해라
    // 단, 이 메소드에 의해 출력되는 Person 객체는 성별이 남자인 객체이어야한다
    // printPersons(list, CheckMale());
    // 위와 똑같이 성별이 남자인 객체만 출력하도록
    // printPersons 메서드를 호출하되 무명클래스를 이용해봐라
    // CheckPerson 인터페이스를 구현하는 무명 클래스를 생성해 printPersons 메서드를 호출하면 된다.
    // 클래스 선언과 정의를 동시에 할 수 있는 방법인 무명클래스를 이용하라

    // printPersons(
    //   list,
    //   new CheckPerson() {
    //     @Override
    //     public boolean test(Person p) {
    //       return p.getGender() == Sex.MALE;
    //     }
    //   }
    // );
    // 오직 하나의 추상메소드만 가지는 인터페이스 타입의 객체를 람다식으로 생성할 수 있다.
    // 람다식은 이름없는 메소드라 할 수 있다.
    // 람다식을 이용하는 이유는 간결하기 때문이다.
    // 람다식을 이용하는 메소드가 필요한 곳에 간단히 메소를 보낼 수 있다.
    // 람다식은 함수형 프로그래밍을 자바에 도입한 것이다.
    // 람다식은 오직 하나의 추상 메소드를 가지는 인터페이스 타입의 객체를 요구하는
    // 메소드의 인자로 전달될 수 있다
    // 람다식 문법
    // (arg1, arg2, ...) -> { body }
    // (type1 arg1, type2 arg2, ... ) -> { body }

    // 람다 형식
    // printPersons(
    //   list,
    //   p -> p.getGender() == Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25
    // );
    // 위의 무명클래스를 람다식으로 구현
    // printPersons(
    //   list,
    //   (p) -> {
    //     return p.getGender() == Sex.MALE;
    //   }
    // );  // 아래 형식으로도 가능
    // printPersons(
    //   list,
    //   (Person p) -> {
    //     return p.getGender() == Sex.MALE;
    //   }
    // );

    // 람다식의 body가 return 문 하나만으로 구성되어 있다면 return 키워드, {}, 문장 끝의 세미콜론(;) 생략가능

    // printPersons(list, p -> p.getGender() == Sex.MALE);
    // 람다식의 매개변수가 오직 하나일 때는 매개변수를 둘러싸는 ()를 생략가능
    // printPersons(
    //   list,
    //   p -> {
    //     return p.getGender() == Sex.MALE;
    //   }
    // );
    // 람다식을 이용해서 printPersons 메소드를 호출하고,
    // 그 결과로 나이 20에서 30살 사이의 여자만 출력되도록 구현하라.

    //printPersons( list, p -> { return p.getGender() == Sex.FEMALE && p.getAge() >= 20 && 30 >= p.getAge(); } );

    sum(10, 20, 30, (n1, n2) -> { return n1 + n2; });
  
  
  }
  public static int sum(int n1, int n2, int n3, Math add) {
    int result = add.add(n1, n2);
    result = add.add(result, n3);
    System.out.println(result);
    return result;
  }

  // collection framework : List, Set, Map, Stack, Queue
  // collection framework는 여러개의 값을 저장하는 자료구조
  // 이 자료구조에 들어갈 수 있는 원소 타입을 자바의 generic 이라는 기능을 이용해 지정할 수 있다.
  // List<Person>, Set<Integer>, Map<String, Person>, ...
  public static void printPersonOlderThan(List<Person> persons, int age) {
    // persons List의 각 원소에 대해서 반복문을 수행
    // 각 원소를 Person타입의 변수 p에 저장
    for (Person p : persons) {
      if (p.getAge() > age) {
        p.printPerson();
      }
    }
  }

  //List(Person) list,int low, int high
  // 위 세개와 매개변수를 통해 Person 객체 리스트와 나이의 범위(low이상, high 미만)를
  // 입력으로 받아, 저 나이의 범위의 Person 정보만 출력하는 메소드
  // printPersonsWithinAgeRange를 구현

  public static void printPersonsWithinAgeRange(
    List<Person> persons,
    int low,
    int high
  ) {
    for (Person p : persons) {
      if (low <= p.getAge() && p.getAge() < high) {
        p.printPerson();
      }
    }
  }

  // public static void printPersons(List<Person> persons, CheckPerson tester) {
  //   for (Person p : persons) {
  //     if (tester.test(p)) {
  //       p.printPerson();
  //     }
  //   }
  // }

  public static void printPersonsWithPredicate(
    List<Person> roster,
    Predicate<Person> tester
  ) {
    for (Person p : roster) {
      if (tester.test(p)) {
        p.printPerson();
      }
    }
  }
}

// class MaleCheckPerSon implements CheckPerson {

//   @Override
//   public boolean test(Person p) {
//     return p.getGender() == Sex.MALE;
//   }

// }

interface CheckPerson {
  boolean test(Person p);
}

// class CheckPerson18to25 implements CheckPerson {
//   public boolean test(Person p) {
//     return p.getGender() == Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25;
//   }
// }

interface Math {
  public int add(int n1, int n2);
}
