package nz.ac.auckland.se281;

import nz.ac.auckland.se281.Types.FloralType;

public class FloralService extends Services {
  private String bookingReference;
  private String floralTypeName;
  private FloralType floralType;
  private int cost;

  public FloralService(String bookingReference, FloralType floralType) {

    super(bookingReference);
    this.floralType = floralType;
    this.floralTypeName = floralType.getName();
    this.cost = cost;
  }

  @Override
  public String getName() {
    String floralType = "Floral (" + this.floralTypeName + ")";
    return floralType;
  }

  public int getCost() {
    return cost;
  }

  public FloralType FloralType() {
    return floralType;
  }
}
