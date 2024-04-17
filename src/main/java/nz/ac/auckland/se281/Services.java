package nz.ac.auckland.se281;


public abstract class Services {

  private String bookingReference;

  public Services(String bookingReference) {
    this.bookingReference = bookingReference;
  }

  // public abstract String getServiceType();

  public abstract int getCost();

  public abstract String getName();
}
