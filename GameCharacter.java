package Test3;

import java.util.ArrayList;

public class GameCharacter {

  private class GameItem {

    String name;
    int type;
    int price;

    int getPrice() {
      return price;
    }

    @Override
    public String toString() {
      return (
        "GameItem [name = " +
        name +
        ", type = " +
        type +
        "price = " +
        price +
        "]"
      );
    }
  }

  private ArrayList<GameItem> list = new ArrayList<GameItem>();

  public void add(String name, int type, int price) {
    GameItem item = new GameItem();
    item.name = name;
    item.type = type;
    item.price = price;
    list.add(item);
  }

  public void pirnt() {
    int total = 0;
    for (GameItem item : list) {
      System.out.println(item);
      total += item.getPrice();
    }
    System.out.println(total);
  }

  public static void main(String args[]) {
    GameCharacter charac = new GameCharacter();
    charac.add("Sword", 1, 100);
    charac.add("Gun", 2, 50);
    charac.pirnt();
  }
}
