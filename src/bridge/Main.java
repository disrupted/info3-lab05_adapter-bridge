package bridge;

public class Main {

  public static void main(String[] args) {
    AbspielDaten cdDaten = new AbspielDaten("Far from Home;Girl;Blossom;Home;Why");
    CDSpieler cdSpieler = new CDSpieler();
    cdSpieler.turnOn();
    cdSpieler.readData(cdDaten);
    cdSpieler.skipTo(3);
    cdSpieler.play();
    cdSpieler.turnOff();

    KassettenSpieler kassettenSpieler = new KassettenSpieler();
    kassettenSpieler.turnOn();
    kassettenSpieler.skipTo(5);
    kassettenSpieler.skipTo(3);
    kassettenSpieler.turnOff();

    ListenAbspielgeraet listenAbspielgeraet = new ListenAbspielgeraet(cdSpieler);
    listenAbspielgeraet.play(cdDaten);
  }
}
