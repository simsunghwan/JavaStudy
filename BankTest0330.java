package Test4;

public class BankTest0330 {

  public static void main(String[] args) {
    BadBank0330 b1 = new BadBank0330();
    NormalBank0330 b2 = new NormalBank0330();
    GoodBank0330 b3 = new GoodBank0330();
    System.out.println("BadBank의 이자율 : " + b1.getInterestRate());
    System.out.println("NormalBank의 이자율 : " + b2.getInterestRate());
    System.out.println("GoodBank의 이자율 : " + b3.getInterestRate());
  }
}
