package bridge;

public class Main {

  public static void main(String[] args) {
    CDSpieler cdSpieler = new CDSpieler();
    cdSpieler.turnOn();
    cdSpieler.skipTo(3);
    cdSpieler.play();
    cdSpieler.turnOff();
  }
}
