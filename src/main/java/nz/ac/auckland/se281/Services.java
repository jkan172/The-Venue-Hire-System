package nz.ac.auckland.se281;

import java.util.ArrayList;

public abstract class Services {

  private String bookingReference;

  public Services(String bookingReference) {
    this.bookingReference = bookingReference;
    
  }

  public abstract String getServiceType();



  public abstract String getName();
}
