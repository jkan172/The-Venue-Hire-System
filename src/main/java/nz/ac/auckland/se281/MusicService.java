package nz.ac.auckland.se281;

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

  @Override
  public String getServiceType() {
    return "Music Service";
  }
}
