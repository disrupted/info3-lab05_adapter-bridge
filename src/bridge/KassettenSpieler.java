package bridge;

public class KassettenSpieler implements IAbspielgeraetImplementierer {
  @Override
  public void readData(AbspielDaten daten) {
    System.out.println("Daten von Kassette lesen");
  }

  @Override
  public void skipTo(int trackId) {
    System.out.println("Springe zu Track #" + trackId);
  }

  @Override
  public void play() {
    System.out.println("Wiedergabe von Kassette");
  }

  @Override
  public void turnOn() {
    System.out.println("Kassettenspieler angeschaltet");
  }

  @Override
  public void turnOff() {
    System.out.println("Kassettenspieler ausgeschaltet");
  }
}
