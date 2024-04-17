package nz.ac.auckland.se281;

import nz.ac.auckland.se281.Types.CateringType;

public class CateringService extends Services {

  private String bookingReference;
  private String serviceType;
  private String costPerPerson;
  private String name;
  private CateringType cateringType;

  // public CateringService(String bookingReference) {
  //   super();
  // }

  public CateringService(String bookingReference, CateringType cateringType) {
    super(bookingReference);
    this.cateringType = cateringType;
    this.name = cateringType.getName();
  }

  @Override
  public String getServiceType() {
    return "Catering Service";
  }

  public String getName() {
    String cateringName = "Catering (" + this.name + ")";
    return cateringName;
  }

  public CateringType getCateringType() {
    return cateringType;

  }
}
