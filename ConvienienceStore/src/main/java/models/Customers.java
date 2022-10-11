package models;


import interfaces.CustomerInterface;

public class Customers extends Person implements CustomerInterface {
    private Double Money;

    public Customers() {
    }

    public Customers(String firstName, String lastName, int age, String email, Double money) {
        super(firstName, lastName, age, email);
        Money = money;
    }

    public Double getMoney() {
        return Money;
    }

    public void setMoney(Double money) {
        this.Money = money;
    }

    @Override
    public String buyProducts(Store store, Products products, int quantity) {
        if (store.isNotAvailable(products,quantity)){
            return "OUT OF STOCK";
        }
        if(getMoney() < products.getPrice() * quantity){
            return "Funds not enough";
        }
        else{
            setMoney(getMoney() - products.getPrice() * quantity);
            return "You can buy this product";
        }
    }


}
