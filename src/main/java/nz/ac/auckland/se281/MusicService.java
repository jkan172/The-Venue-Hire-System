package nz.ac.auckland.se281;

public class MusicService extends Services{
  private String bookingReference;

  public MusicService (String bookingReference) {
    super(bookingReference);
  }

  @Override
  public String getName() {
    String serviceName = "Music";
    return serviceName;
  }
  
}
