package nz.ac.auckland.se281;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import nz.ac.auckland.se281.Types.CateringType;
import nz.ac.auckland.se281.Types.FloralType;

public class VenueHireSystem {

  public VenueHireSystem() {}

  // make a new array list of type Venues
  private ArrayList<Venues> venue = new ArrayList<Venues>();
  private String systemDate;
  private ArrayList<Booking> bookings = new ArrayList<Booking>();
  private String bookingReference;
  private ArrayList<Services> services = new ArrayList<>();

  public void printVenues() {

    int numVenues = venue.size();

    if (numVenues == 0) {
      MessageCli.NO_VENUES.printMessage();
      return;
    }
    if (systemDate == null || systemDate.isEmpty()) {
      MessageCli.CURRENT_DATE.printMessage("not set");
      systemDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
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
              venue.get(i).getNextAvailableDate(systemDate, bookings));
        }
        break;
      case 2:
        MessageCli.NUMBER_VENUES.printMessage("are", "two", "s");
        for (int i = 0; i < numVenues; i++) {
          MessageCli.VENUE_ENTRY.printMessage(
              venue.get(i).getVenueName(),
              venue.get(i).getVenueCode(),
              venue.get(i).getCapacityInput(),
              venue.get(i).getHireFeeInput(),
              venue.get(i).getNextAvailableDate(systemDate, bookings));
        }
        break;
      case 3:
        MessageCli.NUMBER_VENUES.printMessage("are", "three", "s");
        for (int i = 0; i < numVenues; i++) {
          MessageCli.VENUE_ENTRY.printMessage(
              venue.get(i).getVenueName(),
              venue.get(i).getVenueCode(),
              venue.get(i).getCapacityInput(),
              venue.get(i).getHireFeeInput(),
              venue.get(i).getNextAvailableDate(systemDate, bookings));
        }
        break;
      case 4:
        MessageCli.NUMBER_VENUES.printMessage("are", "four", "s");
        for (int i = 0; i < numVenues; i++) {
          MessageCli.VENUE_ENTRY.printMessage(
              venue.get(i).getVenueName(),
              venue.get(i).getVenueCode(),
              venue.get(i).getCapacityInput(),
              venue.get(i).getHireFeeInput(),
              venue.get(i).getNextAvailableDate(systemDate, bookings));
        }
        break;
      case 5:
        MessageCli.NUMBER_VENUES.printMessage("are", "five", "s");
        for (int i = 0; i < numVenues; i++) {
          MessageCli.VENUE_ENTRY.printMessage(
              venue.get(i).getVenueName(),
              venue.get(i).getVenueCode(),
              venue.get(i).getCapacityInput(),
              venue.get(i).getHireFeeInput(),
              venue.get(i).getNextAvailableDate(systemDate, bookings));
        }
        break;
      case 6:
        MessageCli.NUMBER_VENUES.printMessage("are", "six", "s");
        for (int i = 0; i < numVenues; i++) {
          MessageCli.VENUE_ENTRY.printMessage(
              venue.get(i).getVenueName(),
              venue.get(i).getVenueCode(),
              venue.get(i).getCapacityInput(),
              venue.get(i).getHireFeeInput(),
              venue.get(i).getNextAvailableDate(systemDate, bookings));
        }
        break;
      case 7:
        MessageCli.NUMBER_VENUES.printMessage("are", "seven", "s");
        for (int i = 0; i < numVenues; i++) {
          MessageCli.VENUE_ENTRY.printMessage(
              venue.get(i).getVenueName(),
              venue.get(i).getVenueCode(),
              venue.get(i).getCapacityInput(),
              venue.get(i).getHireFeeInput(),
              venue.get(i).getNextAvailableDate(systemDate, bookings));
        }
        break;
      case 8:
        MessageCli.NUMBER_VENUES.printMessage("are", "eight", "s");
        for (int i = 0; i < numVenues; i++) {
          MessageCli.VENUE_ENTRY.printMessage(
              venue.get(i).getVenueName(),
              venue.get(i).getVenueCode(),
              venue.get(i).getCapacityInput(),
              venue.get(i).getHireFeeInput(),
              venue.get(i).getNextAvailableDate(systemDate, bookings));
        }
        break;
      case 9:
        MessageCli.NUMBER_VENUES.printMessage("are", "nine", "s");
        for (int i = 0; i < numVenues; i++) {
          MessageCli.VENUE_ENTRY.printMessage(
              venue.get(i).getVenueName(),
              venue.get(i).getVenueCode(),
              venue.get(i).getCapacityInput(),
              venue.get(i).getHireFeeInput(),
              venue.get(i).getNextAvailableDate(systemDate, bookings));
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
              venue.get(i).getHireFeeInput(),
              venue.get(i).getNextAvailableDate(systemDate, bookings));
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

    for (Venues venues : venue) {
      for (Booking booking : bookings) {
        if (venues.getVenueCode().equals(booking.getBookingVenueCode())) {
          venues.getNextAvailableDate(systemDate, bookings);
          return;
        }
      }
    }

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

    // when the venue is already booked
    for (Venues venues : venue) {
      if (venues.getVenueCode().equals(venueCode2)) {
        for (Booking booking : bookings) {
          if (booking.getBookingVenueCode().equals(venueCode2) && booking.getDate().equals(date)) {
            MessageCli.BOOKING_NOT_MADE_VENUE_ALREADY_BOOKED.printMessage(
                venues.getVenueName(), date);
            return;
          }
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

    LocalDate inputDate =
        LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
    LocalDate systemLocalDate =
        LocalDate.parse(systemDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    for (Venues venues : venue) {
      if (venues.getVenueCode().equals(venueCode2)) {
        if (inputDate.isBefore(systemLocalDate)) {
          MessageCli.BOOKING_NOT_MADE_PAST_DATE.printMessage(date, systemDate);
          return;
        }
      }
    }

    for (Venues venues : venue) {
      if (venues.getVenueCode().equals(venueCode2)) {
        bookingReference = BookingReferenceGenerator.generateBookingReference();
        MessageCli.MAKE_BOOKING_SUCCESSFUL.printMessage(
            bookingReference, venues.getVenueName(), date, String.valueOf(numOfAttendees));
        break;
      }
    }

    // create a new booking and add it to the Booking array list
    Booking newBooking =
        new Booking(
            venueCode2, date, customerEmail, String.valueOf(numOfAttendees), bookingReference);
    bookings.add(newBooking);

    for (Venues venues : venue) {
      if (venues.getVenueCode().equals(venueCode2)) {
        venues.getNextAvailableDate(systemDate, bookings);
        return;
      }
    }

    // for (int i = 0; i < options.length; i++) {
    //   String value = options[i];
    //   System.out.println("option " + i + " = " + value);
    // }
    return;
  }

  public void printBookings(String venueCode) {
    boolean venueExists = false;

    for (Venues venues : venue) {
      // look to find the venue
      if (venues.getVenueCode().equals(venueCode)) {
        venueExists = true;
        MessageCli.PRINT_BOOKINGS_HEADER.printMessage(venues.getVenueName());

        // look to find if there is a booking for the venue
        boolean bookingExists = false;
        for (Booking booking : bookings) {
          if (booking.getBookingVenueCode().equals(venueCode)) {
            MessageCli.PRINT_BOOKINGS_ENTRY.printMessage(
                booking.getBookingReference(), booking.getDate());
            bookingExists = true;
          }
        }
        // if no bookings exist for the venue
        if (!bookingExists) {
          MessageCli.PRINT_BOOKINGS_NONE.printMessage(venues.getVenueName());
        }
        break;
      }
    }
    // if the venue does not exist
    if (!venueExists) {
      MessageCli.PRINT_BOOKINGS_VENUE_NOT_FOUND.printMessage(venueCode);
    }
  }

  public void addCateringService(String bookingReference, CateringType cateringType) {
    boolean bookingExists = false;

    for (Booking booking : bookings) {
      if (booking.getBookingReference().equals(bookingReference)) {
        Services cateringService = new CateringService(bookingReference, cateringType);
        services.add(cateringService);
        MessageCli.ADD_SERVICE_SUCCESSFUL.printMessage(cateringService.getName(), bookingReference);
        bookingExists = true;
        break;
      }
    }
    if (!bookingExists) {
      MessageCli.SERVICE_NOT_ADDED_BOOKING_NOT_FOUND.printMessage(
        "Catering", bookingReference);
    }
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
