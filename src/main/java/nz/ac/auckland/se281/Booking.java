package nz.ac.auckland.se281;

public class Booking {

  private String venueCode;
  private String date;
  private String customerEmail;
  private String numOfAttendees;

  public Booking(String venueCode, String date, String customerEmail, String numOfAttendees) {

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
}
