package Test5.Day0413;

import Test.BoxTest;

public class Car {

  String brand;
  String model;

  public Car() {
    this("Unknown", "Unknown");
  }

  public Car(String argBrand, String argModel) {
    this.brand = argBrand;
    this.model = argModel;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    // obj가 Car 클래스의 인스턴스가 아니면 바로false를 반환하자
    // 자바에는 이목적으로 사용할 수 있는 연산자로 instanceof가 있다
    // 연산자 사용 예 : 3+4 O, +(3, 4) X, 
    if (obj instanceof Car == false) {
      return false;
    }
    // obj는 Car 클래스의 객체라 가정한다.
    // 그래야 Car 클래스의 instance brand, model 멤버에 접근할 수 있다.
    Car objCar = (Car) obj;
    if ( (this.brand).equals(objCar.brand) && (this.model).equals(objCar.model)) {
      return true;
    }
    return false;
  }
}
