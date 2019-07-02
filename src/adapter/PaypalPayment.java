package adapter;

public class PaypalPayment extends PaypalAdapter {

  private String username = "bobby";
  private String password = "notsecret";
  private int amount;
  private String recipient;
  private boolean loggedIn;

  public boolean login(String name, String password) {
    if (this.username.equals(name) && this.password.equals(password)) {
     loggedIn = true;
    }
    return loggedIn;
  }

  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public void confirm() {
    System.out.println("payed " + amount + "EUR through PayPal to " + recipient);
  }
}
