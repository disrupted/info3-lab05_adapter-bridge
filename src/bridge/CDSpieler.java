package bridge;

public class CDSpieler implements IAbspielgeraetImplementierer {

  @Override
  public void readData(AbspielDaten daten) {
    System.out.println("Daten von CD lesen");
  }

  @Override
  public void skipTo(int trackId) {
    System.out.println("Springe zu Track #" + trackId);
  }

  @Override
  public void play() {
    System.out.println("Wiedergabe von CD-Player");
  }

  @Override
  public void turnOn() {
    System.out.println("CD-Player angeschaltet");
  }

  @Override
  public void turnOff() {
    System.out.println("CD-Player ausgeschaltet");
  }

}
