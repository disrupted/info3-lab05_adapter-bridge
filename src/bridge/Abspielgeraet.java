package bridge;

public class Abspielgeraet {

  IAbspielgeraetImplementierer abspielgeraet;
  private int trackId = 1;

  public Abspielgeraet(IAbspielgeraetImplementierer abspielgeraet) {
    this.abspielgeraet = abspielgeraet;
  }

  public void spieleAb(AbspielDaten daten) {
    abspielgeraet.readData(daten);
    abspielgeraet.play();
  }

  public void turnOn() {
    abspielgeraet.turnOn();
  }

  public void turnOff() {
    abspielgeraet.turnOff();
  }
}
