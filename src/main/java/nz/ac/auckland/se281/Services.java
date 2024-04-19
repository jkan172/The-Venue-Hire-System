package nz.ac.auckland.se281;

import nz.ac.auckland.se281.Types.CateringType;
import nz.ac.auckland.se281.Types.FloralType;

public abstract class Services {

  protected String bookingReference;
  protected int cost;
  protected CateringType cateringType;
  protected FloralType floralType;
  protected CateringType cateringCostPerPerson;

  // protected main method and set this for booking reference and cost
  protected Services(String bookingReference, int cost) {
    this.bookingReference = bookingReference;
    this.cost = cost;
  }

  // made a protected get service type abstract method
  protected abstract String getServiceType();

  // made a protected get name abstract method
  protected abstract String getName();

  protected CateringType getCateringType() {
    return cateringType;
  }

  protected int getCost() {
    return this.cost;
  }
}
