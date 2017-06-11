package shopping_basket;
import java.util.*;


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

  public float getTotal(Customer customer) {
    float total = 0;
    for (Item item : basket){
      total += item.getPrice();
    }
    if (total >= 20.00){
      total -= (total * 0.1);
    }
    if (customer.getLoyaltyCard() == true) {
      total -= (total * 0.02);
    }
    return total;
  }

}