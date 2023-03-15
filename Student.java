package Test;

import java.time.LocalDate;

public class Student {

  private String name;
  private int birthYear;

  public void setName(String argName) {
    this.name = argName;
  }

  public void setBirthYear(int argBirthYear) {
    if (birthYear >= 1900) {
      this.birthYear = argBirthYear;
      return;
    }
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    LocalDate d = LocalDate.now();
    int year = d.getYear();
    return (year - birthYear);
  }  
}
