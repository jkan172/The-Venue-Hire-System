package nz.ac.auckland.se281;

import java.util.ArrayList;

public class Venues {

  private String venueName;
  private String venueCode;
  private String capacityInput;
  private String hireFeeInput;

  public Venues(String venueName, String venueCode, String capacityInput, String hireFeeInput) {
    this.venueName = venueName;
    this.venueCode = venueCode;
    this.capacityInput = capacityInput;
    this.hireFeeInput = hireFeeInput;
  }

  public String getVenueName() {
    return venueName;
  }

  public String getVenueCode() {
    return venueCode;
  }

  public String getCapacityInput() {
    return capacityInput;
  }

  public String getHireFeeInput() {
    return hireFeeInput;
  }

  public String getNextAvailableDate(String date, ArrayList<Booking> bookings) {
    if (bookings.isEmpty()) {
      return date;
    } else {
      for (Booking booking : bookings) {
        if (booking.getBookingVenueCode().equals(venueCode) && booking.getDate().equals(date)) {
          // the format of the date is dd/mm/yyyy
          String[] dateParts = date.split("/");
          int day = Integer.parseInt(dateParts[0]); // "day"
          int month = Integer.parseInt(dateParts[1]); // "month"
          int year = Integer.parseInt(dateParts[2]); // "year"
          // adding a day to the date
          int nextDate = day + 1;
          String nextdateString = String.valueOf(nextDate) + "/" + month + "/" + year;
          date = this.getNextAvailableDate(nextdateString, bookings);

          // LocalDate nextDate = LocalDate.of(year, month, day).plusDays(1);
          // date = getNextAvailableDate(nextDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
          // bookings);

        }
      }
      return date;
    }
  }
}
