package Test5.Day0406;

public class Test3 {

  public static void main(String[] args) {
    Student stds[] = new Student[5];
    stds[0] = new Student("석진석", "2201363");
    stds[1] = new Student("이재일", "2201392");
    stds[2] = new Student("김일곤", "2201330");
    stds[3] = new Student("최진수", "1801295");
    stds[4] = new Student("조현준", "1901276");

    professor profs[] = new professor[5];
    profs[0] = new professor("다라마");
    profs[1] = new professor("마바사");
    profs[2] = new professor("가나다");
    profs[3] = new professor("라마바");
    profs[4] = new professor("나다라");

    Util.selectionSortASC(stds);
    for (Student std : stds) {
      System.out.println(std);
    }
    System.out.println("---------------------------------------");
    Util.selectionSortDESC(profs);
    for (professor prof : profs) {
      System.out.println(prof);
    }

    System.out.println();
  }
}
