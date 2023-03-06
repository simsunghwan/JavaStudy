package Test;

class Car {

  private String color;
  private int speed;
  private int gear;
  private int fuelEfficiency;

  Car() {
    fuelEfficiency = 15;
  }

  Car(String argColor) {
    color = argColor;
    fuelEfficiency = 15;
  }

  public String toString() { // overriding
    return (
      "Car [color = " + color + ", speed = " + speed + ", gear = " + gear + "]"
    );
  }

  void gearChange(int argGear) {
    gear = argGear;
  }

  void speedUp() {
    speed += 10;
  }

  void speedDown() {
    speed -= 10;
  }

  float liter(float argKm) {
    return fuelEfficiency / argKm;
  }
}

public class CarTest {

  public static void main(String args[]) {
    Car car1 = new Car("red");
    car1.gearChange(2);
    for (int i = 0; i < 8; i++) {
      car1.speedUp();
    }
    System.out.println(car1.liter(20));
    System.out.println(car1);
  }
}
