package bridge;

public class KassettenSpieler implements IAbspielgeraetImplementierer {

  private int trackId = 1;

  @Override
  public void readData(AbspielDaten daten) {
    System.out.println("Daten von Kassette lesen");
  }

  @Override
  public void skipTo(int trackId) {
    if (trackId > 0) {
      if (this.trackId < trackId) {
        System.out.println("Spule vor zu Track #" + trackId);
      } else {
        System.out.println("Spule zurück zu Track #" + trackId);
      }
      this.trackId = trackId;
    }
  }

  @Override
  public void play() {
    System.out.println("Wiedergabe von Kassette: Track #" + trackId);
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
