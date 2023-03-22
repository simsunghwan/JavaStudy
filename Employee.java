package Test3;

public class Employee {

  private String name;
  private double salary;

  private static int count = 0;

  public Employee(String n, double s) {
    name = n;
    salary = s;
    count++;
  }

  public static int getCount() {
    return count;
  }

  
}
