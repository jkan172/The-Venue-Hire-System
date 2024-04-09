package nz.ac.auckland.se281;

import java.util.ArrayList;
import java.util.List;
import nz.ac.auckland.se281.Types.CateringType;
import nz.ac.auckland.se281.Types.FloralType;

public class VenueHireSystem {

  public VenueHireSystem() {}

  // make a new array list of type Venues
  private List<Venues> venue = new ArrayList<Venues>();
  private String systemDate;
  private List<Booking> bookings = new ArrayList<Booking>();
  private String nextAvailableDate;

  public void printVenues() {

    int numVenues = venue.size();

    if (numVenues == 0) {
      MessageCli.NO_VENUES.printMessage();
      return;
    }

    // using switch statement to print the number of venues
    switch (numVenues) {
      case 1:
        MessageCli.NUMBER_VENUES.printMessage("is", "one", "");
        for (int i = 0; i < numVenues; i++) {
          MessageCli.VENUE_ENTRY.printMessage(
              venue.get(i).getVenueName(),
              venue.get(i).getVenueCode(),
              venue.get(i).getCapacityInput(),
              venue.get(i).getHireFeeInput(),
              nextAvailableDate);
        }
        break;
      case 2:
        MessageCli.NUMBER_VENUES.printMessage("are", "two", "s");
        for (int i = 0; i < numVenues; i++) {
          MessageCli.VENUE_ENTRY.printMessage(
              venue.get(i).getVenueName(),
              venue.get(i).getVenueCode(),
              venue.get(i).getCapacityInput(),
              venue.get(i).getHireFeeInput());
        }
        break;
      case 3:
        MessageCli.NUMBER_VENUES.printMessage("are", "three", "s");
        for (int i = 0; i < numVenues; i++) {
          MessageCli.VENUE_ENTRY.printMessage(
              venue.get(i).getVenueName(),
              venue.get(i).getVenueCode(),
              venue.get(i).getCapacityInput(),
              venue.get(i).getHireFeeInput());
        }
        break;
      case 4:
        MessageCli.NUMBER_VENUES.printMessage("are", "four", "s");
        for (int i = 0; i < numVenues; i++) {
          MessageCli.VENUE_ENTRY.printMessage(
              venue.get(i).getVenueName(),
              venue.get(i).getVenueCode(),
              venue.get(i).getCapacityInput(),
              venue.get(i).getHireFeeInput());
        }
        break;
      case 5:
        MessageCli.NUMBER_VENUES.printMessage("are", "five", "s");
        for (int i = 0; i < numVenues; i++) {
          MessageCli.VENUE_ENTRY.printMessage(
              venue.get(i).getVenueName(),
              venue.get(i).getVenueCode(),
              venue.get(i).getCapacityInput(),
              venue.get(i).getHireFeeInput());
        }
        break;
      case 6:
        MessageCli.NUMBER_VENUES.printMessage("are", "six", "s");
        for (int i = 0; i < numVenues; i++) {
          MessageCli.VENUE_ENTRY.printMessage(
              venue.get(i).getVenueName(),
              venue.get(i).getVenueCode(),
              venue.get(i).getCapacityInput(),
              venue.get(i).getHireFeeInput());
        }
        break;
      case 7:
        MessageCli.NUMBER_VENUES.printMessage("are", "seven", "s");
        for (int i = 0; i < numVenues; i++) {
          MessageCli.VENUE_ENTRY.printMessage(
              venue.get(i).getVenueName(),
              venue.get(i).getVenueCode(),
              venue.get(i).getCapacityInput(),
              venue.get(i).getHireFeeInput());
        }
        break;
      case 8:
        MessageCli.NUMBER_VENUES.printMessage("are", "eight", "s");
        for (int i = 0; i < numVenues; i++) {
          MessageCli.VENUE_ENTRY.printMessage(
              venue.get(i).getVenueName(),
              venue.get(i).getVenueCode(),
              venue.get(i).getCapacityInput(),
              venue.get(i).getHireFeeInput());
        }
        break;
      case 9:
        MessageCli.NUMBER_VENUES.printMessage("are", "nine", "s");
        for (int i = 0; i < numVenues; i++) {
          MessageCli.VENUE_ENTRY.printMessage(
              venue.get(i).getVenueName(),
              venue.get(i).getVenueCode(),
              venue.get(i).getCapacityInput(),
              venue.get(i).getHireFeeInput());
        }
        break;
        // default case for more than 9 venues
      default:
        MessageCli.NUMBER_VENUES.printMessage("are", Integer.toString(numVenues), "s");
        for (int i = 0; i < numVenues; i++) {
          MessageCli.VENUE_ENTRY.printMessage(
              venue.get(i).getVenueName(),
              venue.get(i).getVenueCode(),
              venue.get(i).getCapacityInput(),
              venue.get(i).getHireFeeInput());
        }
    }
  }

  public void createVenue(
      String venueName, String venueCode, String capacityInput, String hireFeeInput) {
    // if the venue name is empty, print the message and return
    if (venueName.trim().isEmpty()) {
      MessageCli.VENUE_NOT_CREATED_EMPTY_NAME.printMessage();
      return;
    }
    // if the capacity or hire fee is not a number, print the message and return
    try {
      int tempNum = Integer.parseInt(capacityInput);

      if (tempNum < 1) {
        MessageCli.VENUE_NOT_CREATED_INVALID_NUMBER.printMessage("capacity", " positive");
        return;
      }

    } catch (NumberFormatException e) {
      MessageCli.VENUE_NOT_CREATED_INVALID_NUMBER.printMessage("capacity", "");
      return;
    }

    try {
      int tempNum2 = Integer.parseInt(hireFeeInput);

      if (tempNum2 < 1) {
        MessageCli.VENUE_NOT_CREATED_INVALID_NUMBER.printMessage("hire fee", " positive");
        return;
      }
    } catch (NumberFormatException e) {
      MessageCli.VENUE_NOT_CREATED_INVALID_NUMBER.printMessage("hire fee", "");
      return;
    }
    // if the venue code already exists, print the message and return
    for (Venues venues : venue) {
      if (venues.getVenueCode().equals(venueCode)) {
        MessageCli.VENUE_NOT_CREATED_CODE_EXISTS.printMessage(venueCode, venues.getVenueName());
        return;
      }
    }
    // create a new venue and add it to the list
    Venues newVenue = new Venues(venueName, venueCode, capacityInput, hireFeeInput);
    venue.add(newVenue);
    MessageCli.VENUE_SUCCESSFULLY_CREATED.printMessage(venueName, venueCode);
  }

  public void setSystemDate(String dateInput) {

    this.systemDate = dateInput;
    MessageCli.DATE_SET.printMessage(dateInput);
    return;
  }

  public void printSystemDate() {

    if (systemDate == null) {
      MessageCli.CURRENT_DATE.printMessage("not set");
    } else {
      MessageCli.CURRENT_DATE.printMessage(systemDate);
    }
  }

  public void makeBooking(String[] options) {

    if (systemDate == null) {
      MessageCli.BOOKING_NOT_MADE_DATE_NOT_SET.printMessage();
      return;
    }

    if (venue.size() == 0) {
      MessageCli.BOOKING_NOT_MADE_NO_VENUES.printMessage();
      return;
    }

    String venueCode2 = options[0];
    String date = options[1];
    // ---------------------------------
    String[] dateParts = date.split("/");
    String day = dateParts[0]; // "day"
    String month = dateParts[1]; // "month"
    String year = dateParts[2]; // "year"
    // ----------------------------------
    String customerEmail = options[2];
    int numOfAttendees = Integer.parseInt(options[3]);

    for (Venues venues : venue) {
      if (venues.getVenueCode().equals(venueCode2)) {
        int venueCapacity = Integer.parseInt(venues.getCapacityInput());

        if (numOfAttendees < (venueCapacity / 4)) {
          MessageCli.BOOKING_ATTENDEES_ADJUSTED.printMessage(
              options[3], String.valueOf(venueCapacity / 4), venues.getCapacityInput());
          numOfAttendees = (venueCapacity / 4);

        } else if (numOfAttendees > venueCapacity) {
          MessageCli.BOOKING_ATTENDEES_ADJUSTED.printMessage(
              options[3], venues.getCapacityInput(), venues.getCapacityInput());
          numOfAttendees = venueCapacity;
        }
      }
    }

    for (Venues venues : venue) {
      for (Booking booking : bookings) {
        if (venues.getVenueCode().equals(venueCode2) && booking.getDate().equals(date)) {
          MessageCli.BOOKING_NOT_MADE_VENUE_ALREADY_BOOKED.printMessage(
              venues.getVenueName(), date);
          return;
        }
      }
    }

    boolean venueFound = false;
    for (Venues venues : venue) {
      if (venues.getVenueCode().equals(venueCode2)) {
        venueFound = true;
        break;
      }
    }
    if (!venueFound) {
      MessageCli.BOOKING_NOT_MADE_VENUE_NOT_FOUND.printMessage(options[0]);
      return;
    }

    if (date.compareTo(systemDate) < 0) {
      MessageCli.BOOKING_NOT_MADE_PAST_DATE.printMessage(date, systemDate);
      return;
    }

    // create a new booking and add it to the Booking array list
    Booking newBooking =
        new Booking(venueCode2, date, customerEmail, String.valueOf(numOfAttendees));
    bookings.add(newBooking);

    for (Venues venues : venue) {
      if (venues.getVenueCode().equals(venueCode2)) {
        MessageCli.MAKE_BOOKING_SUCCESSFUL.printMessage(
            BookingReferenceGenerator.generateBookingReference(),
            venues.getVenueName(),
            date,
            String.valueOf(numOfAttendees));
        break;
      }
    }

    // Next available date
    for (Venues venues : venue) {
      if (venues.getVenueCode().equals(venueCode2)) {
        int nextDay = Integer.parseInt(day) + 1;
        nextAvailableDate = String.valueOf(nextDay) + "/" + dateParts[1] + "/" + dateParts[2];
        break;
      }
    }

    // for (int i = 0; i < options.length; i++) {
    //   String value = options[i];
    //   System.out.println("option " + i + " = " + value);
    // }
    return;
  }

  public void printBookings(String venueCode) {
    // TODO implement this method
  }

  public void addCateringService(String bookingReference, CateringType cateringType) {
    // TODO implement this method
  }

  public void addServiceMusic(String bookingReference) {
    // TODO implement this method
  }

  public void addServiceFloral(String bookingReference, FloralType floralType) {
    // TODO implement this method
  }

  public void viewInvoice(String bookingReference) {
    // TODO implement this method
  }
}
