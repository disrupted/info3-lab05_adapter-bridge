package bridge;

public interface IAbspielgeraetImplementierer {
  void readData(AbspielDaten daten);
  void play();
  void skipTo(int trackId);
  void turnOn();
  void turnOff();
}
