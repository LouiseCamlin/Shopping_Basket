package shopping_basket;

public class Customer {

  private boolean loyaltyCard;

  public Customer(boolean loyaltyCard){
    this.loyaltyCard = loyaltyCard;
  }

  public boolean getLoyaltyCard() {
    return this.loyaltyCard;
  }

}