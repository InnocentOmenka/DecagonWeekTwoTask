package models;
import interfaces.CashierInterface;


public class Cashier extends Staff implements CashierInterface {

    public Cashier() {
    }

    public Cashier(String firstName, String lastName, int age, String email, String id, String role,
                   String qualification, String yearsOfExperience) {
                super(firstName, lastName, age, email, id, role, qualification, yearsOfExperience);
    }


    @Override
    public String sellsProducts(Customers customers, Products products) {
        if (customers.getMoney()>=products.getPrice()){
            return "Goods successfully purchased";
        }
        return "Funds not sufficient";
    }

    @Override
    public String dispenseReceipt(Customers customers, Products products) {
        if (customers.getMoney()>=products.getPrice()){
            return "----------- Transaction Receipt ------------\n";
        }
        return "Transaction unsuccessful";

    }

  @Override
    public String toString() {
        return "Cashier{}";
    }
}


