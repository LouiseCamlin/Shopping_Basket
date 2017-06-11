import shopping_basket.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ItemTest {

  @Test
  public void canGetItemName() {
    Item item = new Item("Garlic Bread", 3.99);
    assertEquals("Garlic Bread", item.getName());
  }

}