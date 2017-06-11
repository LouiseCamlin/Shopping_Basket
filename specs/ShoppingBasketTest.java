import shopping_basket.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ShoppingBasketTest {

  ShoppingBasket items;
  ShoppingBasket basket;
  Item item;
  Item pizza;
  Item wedges;
  Item cookies;
  Customer customer1;
  Customer customer2;
  

  @Before
  public void before() {
    customer1 = new Customer(true);
    customer2 = new Customer(false);
    items = new ShoppingBasket();
    pizza = new Item("Pepperoni", 17.99, false);
    wedges = new Item("Wedges", 3.99, true);
    cookies = new Item ("Cookies", 4.49, false);
  }

  @Test
  public void itemsStartsEmpty() {
    assertEquals(0, items.getBasket().size());
  }

  @Test
  public void canAddItems() {
    items.addItem(cookies);
    assertEquals(1, items.getBasket().size());
  }

  @Test
  public void canRemoveItem() {
    items.addItem(cookies);
    items.removeItem(cookies);
    assertEquals(0, items.getBasket().size());
  }

  @Test
  public void canRemoveAnyItemInArrayList() {
    items.addItem(pizza);
    items.addItem(wedges);
    items.addItem(cookies);
    items.removeItem(wedges);
    assertEquals(2, items.getBasket().size());
  }

  @Test
  public void canEmptyBasket() {
    items.addItem(pizza);
    items.addItem(cookies);
    items.addItem(wedges);
    items.emptyBasket();
    assertEquals(0, items.getBasket().size());
  }

  @Test
  public void canGetBasketTotal() {
    items.addItem(cookies);
    items.addItem(cookies);
    assertEquals(8.98, items.getTotal(customer2), 0.01);
  }

  @Test
  public void canGetDiscountOver20Quid() {
    items.addItem(cookies);
    items.addItem(pizza);
    assertEquals(20.23, items.getTotal(customer2), 0.01);
  }

  @Test
  public void canGetDiscountOver20WithLoadsOfItems() {
    items.addItem(cookies);
    items.addItem(pizza);
    items.addItem(cookies);
    items.addItem(pizza);
    assertEquals(40.46, items.getTotal(customer2), 0.01);
  }

  @Test
  public void canGetLoyaltyCardDiscount() {
    items.addItem(pizza);
    items.addItem(pizza);
    assertEquals(31.73, items.getTotal(customer1), 0.01);
  }

  @Test
  public void canGetLoyaltyCardDiscountAgain(){
    items.addItem(pizza);
    items.addItem(pizza);
    items.addItem(pizza);
    assertEquals(47.60, items.getTotal(customer1), 0.01);
  }

  @Test
  public void canGetLoyaltyWithEvenMoreItems() {
    items.addItem(cookies);
    items.addItem(pizza);
    items.addItem(cookies);
    items.addItem(pizza);
    assertEquals(39.65, items.getTotal(customer1), 0.01);
  }

  @Test
  public void canGetBogof() {
    basket = new ShoppingBasket();
    basket.addItem(wedges);
    basket.addItem(wedges);
    assertEquals(3.99, basket.getTotal(customer2), 0.01);
  }




 }