package shopping_basket;

public class Item {

  private String name;
  private double price;
  private boolean bogof;

  public Item(String name, double price, boolean bogof){
    this.name = name;
    this.price = price;
    this.bogof = bogof;
  }

  public String getName() {
    return this.name;
  }

  public double getPrice() {
    return this.price;
  }

  public boolean getBogof() {
    return this.bogof;
  }
  
}