package Test;

import models.Cashier;
import models.Customers;
import models.Products;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashierTest {

        @Test
    void dispenseReceipt() {
        Cashier cashier = new Cashier("Jacob", "Mike", 33, "jacobmike@gmail.com",
                "Alpha002", "Cashier", "BSC", "Two");
        Products Bread = new Products("Bread", 1000, "shoprite", 3);
        Customers Helen = new Customers("Helen", "Lilian", 30,
                "helen.lilian@gmail.com", 1200.0);
        cashier.dispenseReceipt(Helen, Bread);
        String result2 = cashier.getId();
        String compare2 = "Alpha002";
        assertEquals(result2, compare2);

    }


}