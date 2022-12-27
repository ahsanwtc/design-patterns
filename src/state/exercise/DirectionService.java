package state.exercise;

public class DirectionService {
  private TravelModeEnum travelMode;

  public Object getEta() {
    if (travelMode == TravelModeEnum.DRIVING) {
      System.out.println("Calculating ETA (driving)");
      return 1;
    }
    else if (travelMode == TravelModeEnum.BICYCLING) {
      System.out.println("Calculating ETA (bicycling)");
      return 2;
    }
    else if (travelMode == TravelModeEnum.TRANSIT) {
      System.out.println("Calculating ETA (transit)");
      return 3;
    }
    else {
      System.out.println("Calculating ETA (walking)");
      return 4;
    }
  }

  public Object getDirection() {
    if (travelMode == TravelModeEnum.DRIVING) {
      System.out.println("Calculating Direction (driving)");
      return 1;
    }
    else if (travelMode == TravelModeEnum.BICYCLING) {
      System.out.println("Calculating Direction (bicycling)");
      return 2;
    }
    else if (travelMode == TravelModeEnum.TRANSIT) {
      System.out.println("Calculating Direction (transit)");
      return 3;
    }
    else {
      System.out.println("Calculating Direction (walking)");
      return 4;
    }
  }

  public TravelModeEnum getTravelMode() {
    return travelMode;
  }

  public void setTravelMode(TravelModeEnum travelMode) {
    this.travelMode = travelMode;
  }
}
