package nz.ac.auckland.se281;

import java.util.ArrayList;
import java.util.List;

import nz.ac.auckland.se281.Types.CateringType;
import nz.ac.auckland.se281.Types.FloralType;

public class VenueHireSystem {

  public VenueHireSystem() {}


  private List<Venues> Venue = new ArrayList<Venues>();
  private int countVenue = 0;

  public void printVenues() {

    int numVenues = Venue.size();

    if(numVenues == 0) {
      MessageCli.NO_VENUES.printMessage();
      return;
    }

   

    switch (numVenues) {
      case 1:
      MessageCli.NUMBER_VENUES.printMessage("is", "one", "");
      MessageCli.VENUE_ENTRY.printMessage(Venue.get(0).getVenueName(), Venue.get(0).getVenueCode(), Venue.get(0).getCapacityInput(), Venue.get(0).getHireFeeInput());
        break;
      case 2:
      MessageCli.NUMBER_VENUES.printMessage("are", String.valueOf(numVenues), "s");
      MessageCli.VENUE_ENTRY.printMessage(Venue.get(1).getVenueName(), Venue.get(1).getVenueCode(), Venue.get(1).getCapacityInput(), Venue.get(1).getHireFeeInput());
        break;
      case 3:
      MessageCli.NUMBER_VENUES.printMessage("are", String.valueOf(numVenues), "s");
      MessageCli.VENUE_ENTRY.printMessage(Venue.get(2).getVenueName(), Venue.get(2).getVenueCode(), Venue.get(2).getCapacityInput(), Venue.get(2).getHireFeeInput());
        break;
      case 4:
      MessageCli.NUMBER_VENUES.printMessage("are", String.valueOf(numVenues), "s");
      MessageCli.VENUE_ENTRY.printMessage(Venue.get(3).getVenueName(), Venue.get(3).getVenueCode(), Venue.get(3).getCapacityInput(), Venue.get(3).getHireFeeInput());
        break;
      case 5:
      MessageCli.NUMBER_VENUES.printMessage("are", String.valueOf(numVenues), "s");
      MessageCli.VENUE_ENTRY.printMessage(Venue.get(4).getVenueName(), Venue.get(4).getVenueCode(), Venue.get(4).getCapacityInput(), Venue.get(4).getHireFeeInput());
        break;
      case 6:
      MessageCli.NUMBER_VENUES.printMessage("are", String.valueOf(numVenues), "s");
      MessageCli.VENUE_ENTRY.printMessage(Venue.get(5).getVenueName(), Venue.get(5).getVenueCode(), Venue.get(5).getCapacityInput(), Venue.get(5).getHireFeeInput());
        break;
      case 7:
      MessageCli.NUMBER_VENUES.printMessage("are", String.valueOf(numVenues), "s");
      MessageCli.VENUE_ENTRY.printMessage(Venue.get(6).getVenueName(), Venue.get(6).getVenueCode(), Venue.get(6).getCapacityInput(), Venue.get(6).getHireFeeInput());
        break;
      case 8:
      MessageCli.NUMBER_VENUES.printMessage("are", String.valueOf(numVenues), "s");
      MessageCli.VENUE_ENTRY.printMessage(Venue.get(7).getVenueName(), Venue.get(7).getVenueCode(), Venue.get(7).getCapacityInput(), Venue.get(7).getHireFeeInput());
        break;
      case 9:
        MessageCli.NUMBER_VENUES.printMessage("are", String.valueOf(numVenues), "s");
        MessageCli.VENUE_ENTRY.printMessage(Venue.get(8).getVenueName(), Venue.get(8).getVenueCode(), Venue.get(8).getCapacityInput(), Venue.get(8).getHireFeeInput());
        break;
      default:
        MessageCli.NUMBER_VENUES.printMessage("are", Integer.toString(countVenue), "s");
      
     }
    
  }

  public void createVenue(
      String venueName, String venueCode, String capacityInput, String hireFeeInput) {
        
        if (venueName.trim().isEmpty()) {
          MessageCli.VENUE_NOT_CREATED_EMPTY_NAME.printMessage();
          return;
        } 
        

           try { 
            int tempNum = Integer.parseInt(capacityInput);
            
            if (tempNum < 0 ) {
              MessageCli.VENUE_NOT_CREATED_INVALID_NUMBER.printMessage("capacity", " positive");
                return;
              
            } 
              
            } catch(NumberFormatException e) {
             MessageCli.VENUE_NOT_CREATED_INVALID_NUMBER.printMessage("capacity must be a number." );
             return;
            } 

           try { 
              int tempNum2 = Integer.parseInt(hireFeeInput); 
            
              if (tempNum2 < 0) {
                  MessageCli.VENUE_NOT_CREATED_INVALID_NUMBER.printMessage("hire fee", " positive");
                  return;
              } 
            } catch(NumberFormatException e) {
                MessageCli.VENUE_NOT_CREATED_INVALID_NUMBER.printMessage("hire fee must be a number." );
                return;
            } 

            for (Venues venue : Venue) {
              if (venue.getVenueCode().equals(venueCode)) {
              MessageCli.VENUE_NOT_CREATED_CODE_EXISTS.printMessage(venueCode, venue.getVenueName());
                return;
            }
            }

          Venues newVenue = new Venues(venueName, venueCode, capacityInput, hireFeeInput);
                Venue.add(newVenue);
                countVenue++;
                MessageCli.VENUE_SUCCESSFULLY_CREATED.printMessage(venueName, venueCode);

  

  }


  public void setSystemDate(String dateInput) {
    // TODO implement this method
  }

  public void printSystemDate() {
    // TODO implement this method
  }

  public void makeBooking(String[] options) {
    // TODO implement this method
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
