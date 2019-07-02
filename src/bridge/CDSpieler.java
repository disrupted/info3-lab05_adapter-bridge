package bridge;

import java.util.ArrayList;
import java.util.Arrays;

public class CDSpieler implements IAbspielgeraetImplementierer {

  private int trackId;
  private ArrayList<String> tracks;

  @Override
  public void readData(AbspielDaten daten) {
    System.out.println("Daten von CD lesen");
    tracks = new ArrayList<>(Arrays.asList(daten.toString().split(";")));
    System.out.println("Tracks: " + tracks.toString());
  }

  @Override
  public void skipTo(int trackId) {
    System.out.println("Springe zu Track #" + trackId);
    this.trackId = trackId;
  }

  private String getTrackName(int trackId) {
    return tracks.get(trackId - 1);
  }

  @Override
  public void play() {
    System.out.println("Wiedergabe von CD-Player: Track #" + this.trackId + " - " + getTrackName(trackId));
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
