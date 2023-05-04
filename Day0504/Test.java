package Day0504;

import Test5.Day0406.Student;
import Test5.Day0406.Util;

public class Test {

  public static void main(String[] args) {
    /* 
    String s1 = "BBC";
    String s2 = "BBC";
    
    System.out.println(s1.compareTo(s2));

    Student std1 = new Student("일지메", "컴정");
    Student std2 = new Student("홍길동", "컴정");
    findLarger(std1, std2);
     */
    /* 
    Car c1 = new Car("브랜드1", "모델1", 1, 2000);
    Car c2 = new Car("브랜드2", "모델2", 1, 1000);
    Car c3 = new Car();

    System.out.println(c3);

    int value = c1.compareTo(c2);

    if (value == 1) {
      System.out.println(c1.getBrand() + "의 " + c1.getModel() + "이 비쌈");
    } else if (value == 0) {
      System.out.println("가격이 같음");
    } else {
      System.out.println(c2.getBrand() + "의 " + c2.getModel() + "가 비쌈");
    }

    Test.findLarger(c1, c2); */

    /*   Test5.Day0406.Student stds[] = new Test5.Day0406.Student[5];
    stds[0] = new Student("일지매", "컴정");
    stds[1] = new Student("홍길동", "컴정");
    stds[2] = new Student("김일곤", "컴정");
    stds[3] = new Student("박수헌", "컴정");
    stds[4] = new Student("안영진", "컴정");

    Util.selectionSortASC(stds);

    for (Test5.Day0406.Student std : stds) {
      System.out.println(std.getName());
    } */
  }

  public static void findLarger(Comparable c1, Comparable c2) {
    if (c1.compareTo(c2) == 0) {
      System.out.println("같다");
    } else if (c1.compareTo(c2) >= 0) {
      System.out.println("첫번째가 크다");
    } else {
      System.out.println("두번째가 크다");
    }
  }
}
