package nz.ac.auckland.se281;

import nz.ac.auckland.se281.Types.CateringType;

public class MusicService extends Services {
  private String bookingReference;
  private int cost;

  public MusicService(String bookingReference, int cost) {
    super(bookingReference, cost);
  }

  @Override
  public String getName() {
    String serviceName = "Music";
    return serviceName;
  }

  public int getCost() {
    return 500;
  }
}
