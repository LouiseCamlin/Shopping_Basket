package shopping_basket;

import java.util.*;
import java.util.ArrayList;

public class ShoppingBasket {


  private ArrayList<Item> basket;

  public ShoppingBasket() {
    this.basket = new ArrayList<Item>();
  }

  public ArrayList<Item> getBasket() {
    return this.basket;
  }

  public void addItem(Item item) {
    this.basket.add(item);
  }

  public void removeItem(int item) {
    this.basket.remove(0);
  }

}