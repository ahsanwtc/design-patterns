package state.exercise;

public class DirectionServiceNew {
  private TravelMode travelMode;

  public DirectionServiceNew(TravelMode travelMode) {
    this.travelMode = travelMode;
  }

  public TravelMode getTravelMode() {
    return travelMode;
  }

  public void setTravelMode(TravelMode travelMode) {
    this.travelMode = travelMode;
  }

  public Object getEta() {
    return this.travelMode.getEta();
  }

  public Object getDirection() {
    return this.travelMode.getDirections();
  }
}
