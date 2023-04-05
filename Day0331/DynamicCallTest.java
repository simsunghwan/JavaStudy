package Test4.Day0331;

public class DynamicCallTest {
  public static void main(String[] args) {
    Animal a = new Animal();
    Dog dog = new Dog();
    Cat cat = new Cat();

    Animal obj;
    obj = a;
    obj.sound();
    
    obj = dog;
    obj.sound();

    obj = cat;
    obj.sound();
  }
  
}
