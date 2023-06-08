package Day0530_Day0601;

import java.time.LocalDate;
import java.time.Period;

public class Person {

  public Person(
    String name,
    LocalDate birthDay,
    Sex gender,
    String emailAddress
  ) {
    this.name = name;
    this.birthDay = birthDay;
    this.gender = gender;
    this.emailAddress = emailAddress;
  }

  private String name;
  LocalDate birthDay;
  private Sex gender;
  private String emailAddress;

  public int getAge() {
    return Period.between(birthDay, LocalDate.now()).getYears();
    // method chaining : 메소드 호출을 쇠사슬이 연결된 것처럼, 이어서 쭉 호출하는 것
    //this.getname().substring(1,2);
  }

  public Sex getGender() {
    return gender;
  }

  public void printPerson() {
    System.out.println(
      "Name:" +
      name +
      " BirthDay: " +
      birthDay +
      " Gender: " +
      gender +
      " Email: " +
      emailAddress
    );
  }
}
