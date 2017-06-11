import shopping_basket.*;
import org.junit.*;
import static org.junit.Assert.*;

public class CustomerTest {

  @Test
  public void canGetLoyaltyCard(){
    Customer customer = new Customer(true);
    assertEquals(true, customer.getLoyaltyCard());
  }

  @Test
  public void canGetLoyaltyCardWhenFalse(){
    Customer customer = new Customer(false);
    assertEquals(false, customer.getLoyaltyCard());
  }
}