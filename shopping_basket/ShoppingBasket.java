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

  public void removeItem(Item item) {
    this.basket.remove(item);
  }

  public void emptyBasket() {
    this.basket.clear();
  }

  public float getTotal() {
    float total = 0;
    for (Item item : basket){
      total += item.getPrice();
    }
    return total;
  }

}