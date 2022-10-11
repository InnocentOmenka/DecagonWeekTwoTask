package models;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private String address;
    private String storeName;
    private List<Products> products = new ArrayList<>();
    private List<Staff> staff;
    private List<Customers> customers;

    private List<Applicants> applicants;
    //private Applicants applicants;
    private Manager manager;

    public Store() {
    }

    public Store(String address, String storeName, ArrayList<Products> products, List<Staff> staff,
                 List<Customers> customers, List<Applicants> applicants, Manager manager) {
        this.address = address;
        this.storeName = storeName;
        this.products = products;
        this.staff = staff;
        this.customers = customers;
        this.applicants = applicants;
        this.manager = manager;
    }
    public boolean isNotAvailable(Products products, int quantity){
        if((products.getQuantity() < quantity)){
            return true;
        }
        return false;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Products> products) {
        this.products = products;
    }

    public List<Staff> getStaff() {
        return staff;
    }

    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }

    public List<Customers> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customers> customers) {
        this.customers = customers;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Store{" +
                ", address='" + address + '\'' +
                ", storeName='" + storeName + '\'' +
                ", products=" + products +
                ", staff=" + staff +
                ", customers=" + customers +
                ", applicants=" + applicants +
                ", manager=" + manager +
                '}';
    }
}




