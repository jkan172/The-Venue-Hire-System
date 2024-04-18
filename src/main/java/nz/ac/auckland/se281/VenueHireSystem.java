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
    //Checking to see if booking exists using boolean
    boolean bookingExists = false;

    for (Booking booking : bookings) {
      if (booking.getBookingReference().equals(bookingReference)) {
        //make a new instance of a Catering Service
        Services cateringService =
            new CateringService(bookingReference, cateringType, cateringType.getCostPerPerson());
        //add the newly made instance to the services list
        services.add(cateringService);
        MessageCli.ADD_SERVICE_SUCCESSFUL.printMessage(
            "Catering (" + cateringService.getName() + ")", bookingReference);
        bookingExists = true;
        break;
      }
    }
    //print error messages if the booking reference does not exist
    if (!bookingExists) {
      MessageCli.SERVICE_NOT_ADDED_BOOKING_NOT_FOUND.printMessage("Catering", bookingReference);
    }
  }

  public void addServiceMusic(String bookingReference) {
    boolean bookingExists = false;
    for (Booking booking : bookings) {
      if (booking.getBookingReference().equals(bookingReference)) {
        int cost = 500;
        //make a new instance of a Music Service
        Services musicService = new MusicService(bookingReference, cost);
        //Add the it into the services array list
        services.add(musicService);
        MessageCli.ADD_SERVICE_SUCCESSFUL.printMessage(musicService.getName(), bookingReference);
        bookingExists = true;
      }
    }
    //if booking reference doesn't exist then print the error message
    if (!bookingExists) {
      MessageCli.SERVICE_NOT_ADDED_BOOKING_NOT_FOUND.printMessage("Music", bookingReference);
    }
  }

  public void addServiceFloral(String bookingReference, FloralType floralType) {
    boolean bookingExists = false;

    for (Booking booking : bookings) {
      if (booking.getBookingReference().equals(bookingReference)) {
        //make a new instance of the Floral Service 
        Services floralServices =
            new FloralService(bookingReference, floralType, floralType.getCost());
        //Add the instance into the services array list
        services.add(floralServices);
        MessageCli.ADD_SERVICE_SUCCESSFUL.printMessage(
            "Floral (" + floralServices.getName() + ")", bookingReference);
        bookingExists = true;
        break;
      }
    }
    //if booking reference doesn't exist then print error message
    if (!bookingExists) {
      MessageCli.SERVICE_NOT_ADDED_BOOKING_NOT_FOUND.printMessage("Floral", bookingReference);
    }
  }

  public void viewInvoice(String bookingReference) {
    String curstomerEmail = null;
    String bookingDate = null;
    int numOfAttendees = 0;
    String bookingVenueCode = null;

    boolean bookingExists = false;

    //loop through the bookings list and check the booking reference exist in the list
    for (Booking booking : bookings) {
      if (booking.getBookingReference().equals(bookingReference)) {
        //if the booking reference matches then set variables to use for printing the invoice
        curstomerEmail = booking.getCustomerEmail();
        bookingDate = booking.getDate();
        numOfAttendees = booking.getNumOfAttendees();
        bookingVenueCode = booking.getBookingVenueCode();
        bookingExists = true;

        //print error message if the booking reference doesn't match
      } 
    }

    if (!bookingExists) {
      MessageCli.VIEW_INVOICE_BOOKING_NOT_FOUND.printMessage(bookingReference);
        return;
    }

    boolean venueExists = false;
    String venueName = null;
    String hireFee = null;

    //Loop through all the venues and use the getters to get the venueName and hireFeeInput
    for (Venues venues : venue) {
      if (venues.getVenueCode().equals(bookingVenueCode)) {
        venueName = venues.getVenueName();
        hireFee = venues.getHireFeeInput();
        venueExists = true;
      }
    }
//initialize variables for us to use for printing the invoice
    CateringService cateringService;
    String cateringName = null;
    CateringType cateringType;
    int cateringCostPerPerson = 0;
    MusicService musicService;
    String musicName = null;
    int musicCost = 0;

    String floralName = null;
    FloralType floralType;
    int floralCost = 0;
    int totalCateringCost = 0;

    //use boolean to check if each services exist
    boolean cateringExists = false;
    boolean musicExists = false;
    boolean floralExists = false;

    //loop through the services array list to see if each services exist for this booking
    for (Services service : services) {
      if (service.bookingReference.equals(bookingReference)) {
      //if catering service is called then the variables are set for the name, catering type and cost 
      if (service.getServiceType().contains("Catering Service")) {
        cateringService = (CateringService) service;
        cateringName = cateringService.getName();
        cateringType = cateringService.getCateringType();
        cateringCostPerPerson = cateringService.getCost();
        totalCateringCost = cateringCostPerPerson * numOfAttendees;
        cateringExists = true;
      }
      //if music service is called then the getters get the name and the constant cost of $500
      if (service.getServiceType().contains("Music Service")) {
        musicService = (MusicService) service;
        musicName = musicService.getName();
        musicCost = musicService.getCost();
        musicExists = true;
      }
      //if the floral service is called then the getter gets the variables for the name, floral type and the cost
      if (service.getServiceType().contains("Floral Service")) {
        FloralService floralService = (FloralService) service;
        floralName = floralService.getName();
        floralType = floralService.getFloralType();
        floralCost = floralService.getCost();
        floralExists = true;
      }
    }
    }
    //print the top half of the invoice using the variables that we got from above
    MessageCli.INVOICE_CONTENT_TOP_HALF.printMessage(
        bookingReference,
        curstomerEmail,
        systemDate,
        bookingDate,
        String.valueOf(numOfAttendees),
        venueName);
      //print the hire fee for booking the venue
    MessageCli.INVOICE_CONTENT_VENUE_FEE.printMessage(hireFee);

    //if catering exists then the invoice part of catering service is printed
    if (cateringExists) {
      MessageCli.INVOICE_CONTENT_CATERING_ENTRY.printMessage(
          cateringName, String.valueOf(totalCateringCost));
    }
    //if music exists then the invoice part for music service is printed
    if (musicExists) {
      MessageCli.INVOICE_CONTENT_MUSIC_ENTRY.printMessage(String.valueOf(musicCost));
    }
    //if floral exists then the invoice part for floral service is printed
    if (floralExists) {
      MessageCli.INVOICE_CONTENT_FLORAL_ENTRY.printMessage(floralName, String.valueOf(floralCost));
    }

    //calculate the total amount for cost added up
    int TotalAmount = Integer.parseInt(hireFee) + totalCateringCost + musicCost + floralCost;

    //print the bottom half of the invoice
    MessageCli.INVOICE_CONTENT_BOTTOM_HALF.printMessage(String.valueOf(TotalAmount));
  }
}
