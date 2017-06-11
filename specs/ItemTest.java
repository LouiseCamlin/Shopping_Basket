import shopping_basket.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ItemTest {

  @Test
  public void canGetItemName() {
    Item item = new Item("Garlic Bread", 3.99, true);
    assertEquals("Garlic Bread", item.getName());
  }

  @Test
  public void canGetPrice() {
    Item item = new Item("Garlic Bread", 3.99, true);
    assertEquals(3.99, item.getPrice(), 0);
  }

}