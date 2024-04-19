package nz.ac.auckland.se281;

import nz.ac.auckland.se281.Types.CateringType;

public class CateringService extends Services {

  private String bookingReference;
  private String serviceType;
  private int cost;
  private String name;
  private CateringType cateringType;

  // public CateringService(String bookingReference) {
  //   super();
  // }

  public CateringService(String bookingReference, CateringType cateringType, int cost) {
    // used super() to get the booking reference and cost from the parent class
    super(bookingReference, cost);
    this.cateringType = cateringType;
    this.name = cateringType.getName();
    this.cost = cateringType.getCostPerPerson();
  }

  // use override to use this particular get service type method for catering services
  @Override
  public String getServiceType() {
    return "Catering Service";
  }

  // override get name to use this get name method for catering services
  @Override
  public String getName() {
    String cateringName = this.name;
    return cateringName;
  }

  public CateringType getCateringType() {
    return cateringType;
  }

  public int getCost() {
    return cost;
  }
}
