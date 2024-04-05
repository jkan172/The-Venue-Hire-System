package nz.ac.auckland.se281;

import java.util.ArrayList;
import java.util.List;

import nz.ac.auckland.se281.Types.CateringType;
import nz.ac.auckland.se281.Types.FloralType;

public class VenueHireSystem {

  public VenueHireSystem() {}


  private List<Venues> Venue = new ArrayList<Venues>();
  

  public void printVenues() {

    int numVenues = Venue.size();

    if(numVenues == 0) {
      MessageCli.NO_VENUES.printMessage();
      return;
    }

    switch (numVenues) {
      case 1:
        MessageCli.NUMBER_VENUES.printMessage("is", "one", "");
        for (int i = 0; i < numVenues; i++) {
           MessageCli.VENUE_ENTRY.printMessage(Venue.get(i).getVenueName(), Venue.get(i).getVenueCode(), Venue.get(i).getCapacityInput(), Venue.get(i).getHireFeeInput());
        }
        break;
      case 2:
        MessageCli.NUMBER_VENUES.printMessage("are", "two", "s");
        for (int i = 0; i < numVenues; i++) {  
          MessageCli.VENUE_ENTRY.printMessage(Venue.get(i).getVenueName(), Venue.get(i).getVenueCode(), Venue.get(i).getCapacityInput(), Venue.get(i).getHireFeeInput());
        }
        break;
      case 3:
        MessageCli.NUMBER_VENUES.printMessage("are", "three", "s");
        for (int i = 0; i < numVenues; i++) {
          MessageCli.VENUE_ENTRY.printMessage(Venue.get(i).getVenueName(), Venue.get(i).getVenueCode(), Venue.get(i).getCapacityInput(), Venue.get(i).getHireFeeInput());
        }
        break;
      case 4:
        MessageCli.NUMBER_VENUES.printMessage("are", "four", "s");
        for (int i = 0; i < numVenues; i++) {  
          MessageCli.VENUE_ENTRY.printMessage(Venue.get(i).getVenueName(), Venue.get(i).getVenueCode(), Venue.get(i).getCapacityInput(), Venue.get(i).getHireFeeInput());
        }
        break;
      case 5:
        MessageCli.NUMBER_VENUES.printMessage("are", "five", "s");
        for (int i = 0; i < numVenues; i++) {  
          MessageCli.VENUE_ENTRY.printMessage(Venue.get(i).getVenueName(), Venue.get(i).getVenueCode(), Venue.get(i).getCapacityInput(), Venue.get(i).getHireFeeInput());
        }
        break;
      case 6:
        MessageCli.NUMBER_VENUES.printMessage("are", "six", "s");
        for (int i = 0; i < numVenues; i++) {  
          MessageCli.VENUE_ENTRY.printMessage(Venue.get(i).getVenueName(), Venue.get(i).getVenueCode(), Venue.get(i).getCapacityInput(), Venue.get(i).getHireFeeInput());
        }
        break;
      case 7:
        MessageCli.NUMBER_VENUES.printMessage("are", "seven", "s");
        for (int i = 0; i < numVenues; i++) {  
          MessageCli.VENUE_ENTRY.printMessage(Venue.get(i).getVenueName(), Venue.get(i).getVenueCode(), Venue.get(i).getCapacityInput(), Venue.get(i).getHireFeeInput());
        }
        break;
      case 8:
        MessageCli.NUMBER_VENUES.printMessage("are", "eight", "s");
        for (int i = 0; i < numVenues; i++) {  
          MessageCli.VENUE_ENTRY.printMessage(Venue.get(i).getVenueName(), Venue.get(i).getVenueCode(), Venue.get(i).getCapacityInput(), Venue.get(i).getHireFeeInput());
        }
        break;
      case 9:
        MessageCli.NUMBER_VENUES.printMessage("are", "nine", "s");
        for (int i = 0; i < numVenues; i++) {  
          MessageCli.VENUE_ENTRY.printMessage(Venue.get(i).getVenueName(), Venue.get(i).getVenueCode(), Venue.get(i).getCapacityInput(), Venue.get(i).getHireFeeInput());
        }
        break;
      default:
        MessageCli.NUMBER_VENUES.printMessage("are", Integer.toString(numVenues), "s");
        for (int i = 0; i < numVenues; i++) {  
          MessageCli.VENUE_ENTRY.printMessage(Venue.get(i).getVenueName(), Venue.get(i).getVenueCode(), Venue.get(i).getCapacityInput(), Venue.get(i).getHireFeeInput());
        }
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
            
            if (tempNum < 1 ) {
              MessageCli.VENUE_NOT_CREATED_INVALID_NUMBER.printMessage("capacity", " positive");
                return;
              
            } 
              
            } catch(NumberFormatException e) {
             MessageCli.VENUE_NOT_CREATED_INVALID_NUMBER.printMessage("capacity", "" );
             return;
            } 

           try { 
              int tempNum2 = Integer.parseInt(hireFeeInput); 
            
              if (tempNum2 < 1) {
                  MessageCli.VENUE_NOT_CREATED_INVALID_NUMBER.printMessage("hire fee", " positive");
                  return;
              } 
            } catch(NumberFormatException e) {
                MessageCli.VENUE_NOT_CREATED_INVALID_NUMBER.printMessage("hire fee", "");
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
                MessageCli.VENUE_SUCCESSFULLY_CREATED.printMessage(venueName, venueCode);
  }


  public void setSystemDate(String dateInput) {
    
    MessageCli.DATE_SET.printMessage(dateInput);
    return;

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
