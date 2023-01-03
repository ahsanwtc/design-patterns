package observer.exercise;

public class Stock extends Subject {
  private String symbol;
  private float price;

  public Stock(String symbol, float price) {
    this.symbol = symbol;
    this.price = price;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
    notifyObserver();
  }

  public String getSymbol() {
    return symbol;
  }

  @Override
  public String toString() {
    return "Stock{" +
            "symbol='" + symbol + '\'' +
            ", price=" + price +
            '}';
  }
}
