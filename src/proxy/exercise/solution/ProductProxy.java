package proxy.exercise.solution;


import proxy.exercise.DbContext;
import proxy.exercise.Product;

public class ProductProxy extends Product {
  private DbContext dbContext;

  public ProductProxy(int id, DbContext dbContext) {
    super(id);
    this.dbContext = dbContext;
  }

  @Override
  public void setName(String name) {
    super.setName(name);
    dbContext.markAsChanged(this);
  }
}
