package Test;

import models.Customers;
import models.Products;
import models.Store;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomersTest {

    @Test
        void buyProducts(){
            Store AlphaStore = new Store();
            Products Bread = new Products("Bread", 1000, "shoprite", 3);
            Customers Helen = new Customers("Helen", "Lilian", 30,
                    "helen.lilian@gmail.com", 1200.0);
            Helen.buyProducts(AlphaStore, Bread, 2);
            Double compare1 = 100.00;
            assertEquals(compare1, Helen.getMoney());
        }
    }