package bridge;

import java.util.ArrayList;
import java.util.Arrays;

public class ListenAbspielgeraet extends Abspielgeraet {

  private ArrayList<String> tracks;

  public ListenAbspielgeraet(IAbspielgeraetImplementierer abspielgeraet) {
    super(abspielgeraet);
  }

  public void play(AbspielDaten daten) {
    abspielgeraet.readData(daten);
    tracks = new ArrayList<>(Arrays.asList(daten.toString().split(";")));
    for (int trackId = 1; trackId <= tracks.size(); trackId++) {  // play tracks one after another in chronological order
      abspielgeraet.skipTo(trackId);
      abspielgeraet.play();
    }
  }
}
