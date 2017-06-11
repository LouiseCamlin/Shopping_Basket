import shopping_basket.*;
import org.junit.*;
import static org.junit.Assert.*;

public class CustomerTest {

  @Test
  public void canGetLoyaltyCard_True(){
    Customer customer = new Customer(true);
    assertEquals(true, customer.getLoyaltyCard());
  }

  @Test
  public void canGetLoyaltyCard_False(){
    Customer customer = new Customer(false);
    assertEquals(false, customer.getLoyaltyCard());
  }
}