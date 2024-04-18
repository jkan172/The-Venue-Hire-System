package nz.ac.auckland.se281;

public class Booking {

  private String venueCode;
  private String date;
  private String customerEmail;
  private String numOfAttendees;
  private String bookingReference;

  public Booking(
      String venueCode,
      String date,
      String customerEmail,
      String numOfAttendees,
      String bookingReference) {

    this.venueCode = venueCode;
    this.date = date;
    this.customerEmail = customerEmail;
    this.numOfAttendees = numOfAttendees;
    this.bookingReference = bookingReference;
  }

  public String getBookingVenueCode() {
    return venueCode;
  }

  public String getDate() {
    return date;
  }

  public String getBookingReference() {
    return bookingReference;
  }

  public String getCustomerEmail() {
    return customerEmail;
  }

  public int getNumOfAttendees() {
    int attendees = Integer.parseInt(numOfAttendees);
    return attendees;
  }
}
