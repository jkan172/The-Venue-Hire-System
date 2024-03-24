package nz.ac.auckland.se281;

import java.util.ArrayList;
import java.util.List;

import nz.ac.auckland.se281.Types.CateringType;
import nz.ac.auckland.se281.Types.FloralType;

public class VenueHireSystem {

  public VenueHireSystem() {}

  private static List<Venues> Venue = new ArrayList<Venues>();

  public void printVenues() {

    /**if (Venues.isEmpty()) {
      MessageCli.NO_VENUES.printMessage();
  
    } else {
      for (Venues venue : Venues.getVenues()) {
        MessageCli.VENUE_ENTRY.printMessage(
            venue.getVenueName(),
            venue.getVenueCode(),
            
    }*/
    
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

           Venues newVenue = new Venues(venueName, venueCode, capacityInput, hireFeeInput);
                Venue.add(newVenue);
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
