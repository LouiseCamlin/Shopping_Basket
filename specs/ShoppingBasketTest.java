import shopping_basket.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ShoppingBasketTest {

  ShoppingBasket items;
  

  @Before
  public void before() {
    items = new ShoppingBasket();
  }

  @Test
  public void itemsStartsEmpty() {
    assertEquals(0, items.getBasket().size());
  }

}