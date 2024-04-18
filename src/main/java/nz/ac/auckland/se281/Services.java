package nz.ac.auckland.se281;

import nz.ac.auckland.se281.Types.CateringType;
import nz.ac.auckland.se281.Types.FloralType;

public abstract class Services {

  protected String bookingReference;
  protected int cost;
  protected CateringType cateringType;
  protected FloralType floralType;
  protected CateringType cateringCostPerPerson;

  public Services(String bookingReference, int cost) {
    this.bookingReference = bookingReference;
    this.cost = cost;
    // this.cateringCostPerPerson = cateringType.getCostPerPerson();
    
  }

  public abstract String getServiceType();

  public abstract String getName();

  public CateringType getCateringType () {
    return cateringType;
  }

  public int getCost() {
    return this.cost;
  }

}
