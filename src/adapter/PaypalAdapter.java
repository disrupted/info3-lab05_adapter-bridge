package adapter;

public class PaypalAdapter implements IPayment {

  @Override
  public void pay(int amount) {
    PaypalPayment payment = new PaypalPayment();
    if (payment.login("bobby", "notsecret")) {
      payment.setAmount(amount);
      payment.setRecipient("500 Days of summer online store");
      payment.confirm();
    }
  }
}
