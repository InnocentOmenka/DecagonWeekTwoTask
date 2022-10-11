package interfaces;

import models.Customers;
import models.Products;

public interface CashierInterface {
    public String sellsProducts(Customers customers, Products products);
    public String dispenseReceipt(Customers customers, Products products);
}
