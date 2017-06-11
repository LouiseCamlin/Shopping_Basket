import shopping_basket.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ShoppingBasketTest {

  ShoppingBasket items;
  Item item;
  

  @Before
  public void before() {
    items = new ShoppingBasket();
  }

  @Test
  public void itemsStartsEmpty() {
    assertEquals(0, items.getBasket().size());
  }

  @Test
  public void canAddItems() {
    items.addItem(item);
    assertEquals(1, items.getBasket().size());
  }

  @Test
  public void canRemoveItem() {
    items.addItem(item);
    items.removeItem(0);
    assertEquals(0, items.getBasket().size());
  }

 @Test
 public void canRemoveAnyItemInArrayList() {
   items.addItem(item);
   items.addItem(item);
   items.addItem(item);
   items.removeItem(1);
   assertEquals(2, items.getBasket().size());
 }

 @Test
 public void canEmptyBasket() {
   items.addItem(item);
   items.addItem(item);
   items.addItem(item);
   items.emptyBasket();
   assertEquals(0, items.getBasket().size());
 }

}