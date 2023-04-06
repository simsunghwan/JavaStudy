package Test5.Day0406;

public class professor extends Comparable {

  private String name;

  public professor(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int compareTo(Comparable anotherVal) {
    String yourname = ((professor) anotherVal).getName();

    return name.compareTo(yourname);
  }

  @Override
  public String toString() {
    return "[ 성함 : " + name + "교수님 ]";
  }
}
