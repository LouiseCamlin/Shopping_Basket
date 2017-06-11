import shopping_basket.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ShoppingBasketTest {

  ShoppingBasket items;
  Item item;
  Item pizza;
  Item wedges;
  Item cookies;
  

  @Before
  public void before() {
    items = new ShoppingBasket();
    pizza = new Item("Pepperoni", 17.99);
    wedges = new Item("Wedges", 3.99);
    cookies = new Item ("Cookies", 4.49);
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
    items.addItem(wedges);
    items.addItem(cookies);
    assertEquals(8.48, items.getTotal(), 0.01);
  }

  @Test
  public void canGetDiscountOver20Quid() {
    items.addItem(cookies);
    items.addItem(pizza);
    assertEquals(20.23, items.getTotal(), 0.01);
  }

 }