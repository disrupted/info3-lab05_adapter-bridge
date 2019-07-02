package adapter;

public class WebshopPayment implements IPayment {

  @Override
  public void pay(int amount) {
    System.out.println("payed " + amount + "EUR through Webshop");
  }
}
