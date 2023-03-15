package Test;

public class StudentTest {
  public static void main(String args[]) {
    Student std = new Student();
    std.setName("홍길동");
    std.setBirthYear(2000);
    //
    System.out.println(std.getName());
    System.out.println(std.getAge());
    
  }
}
