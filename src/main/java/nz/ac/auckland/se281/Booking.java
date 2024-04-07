package nz.ac.auckland.se281;

public class Booking {

  private String venueCode;
  private String date;
  private String customerEmail;
  private String numOfAttendees;
  private String venueName;

  public Booking(String venueName, String venueCode, String date, String customerEmail , String numOfAttendees)
  
  {
    this.venueName = venueName;
    this.venueCode = venueCode;
    this.date = date;
    this.customerEmail = customerEmail;
    this.numOfAttendees = numOfAttendees;

  }

  public String getBookingVenueCode() {
    return venueCode;
  }

  public String getDate() {
    return date;
  }

  public String getVenueName() {
    return venueName;
  }
}
