package nz.ac.auckland.se281;

import nz.ac.auckland.se281.Types.FloralType;

public class FloralService extends Services {
  private String bookingReference;
  private String floralTypeName;
  private FloralType floralType;
  private int cost;

  public FloralService(String bookingReference, FloralType floralType, int cost) {

    super(bookingReference, cost);
    this.floralType = floralType;
    this.floralTypeName = floralType.getName();
    this.cost = floralType.getCost();
  }

  @Override
  public String getName() {
    String floralType = this.floralTypeName;
    return floralType;
  }

  public int getCost() {
    return cost;
  }

  public String getServiceType() {
    return "Floral Service";
  }

  public FloralType getFloralType() {
    return floralType;
  }
}
