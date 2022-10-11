package interfaces;

import models.Customers;
import models.Products;
import models.Store;

public interface CustomerInterface {

    public String buyProducts(Store store, Products products, int quantity);
}
