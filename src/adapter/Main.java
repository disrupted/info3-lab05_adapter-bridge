package adapter;

public class Main {

  public static void main(String[] args) {
    IPayment webPayment = new WebshopPayment();
    webPayment.pay(10);
    IPayment paypalPayment = new PaypalPayment();
    paypalPayment.pay(10);
  }
}
