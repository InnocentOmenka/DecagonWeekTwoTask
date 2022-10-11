import enums.Grades;
import enums.Qualifications;
import models.*;
import models.Customers;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        //Creating an instance of Bread
        Products Bread = new Products();
        Bread.setPrice(500);
        Bread.setName("Bread");
        Bread.setBrand("Shoprite");
        Bread.setQuantity(0);


       //Creating an instance of Milk
        Products Milk = new Products();
        Milk.setBrand("Peak");
        Milk.setQuantity(2);
        Milk.setName("Milk");
        Milk.setPrice(1600);

        //Creating an instance of Cornflakes
        Products Cornflakes = new Products();
        Cornflakes.setName("Cornflakes");
        Cornflakes.setPrice(2000);
        Cornflakes.setQuantity(3);
        Cornflakes.setBrand("Nasco");

       //Creating an instance of customer
        Customers Helen = new Customers();
        Helen.setFirstName("Helen");
        Helen.setLastName("Lilian");
        Helen.setAge(30);
        Helen.setEmail("helen.lilian@gmail.com");
        Helen.setMoney(120000.0);

        //Customer two
        Customers Grace = new Customers();
        Grace.setFirstName("Grace");
        Grace.setLastName("John");
        Grace.setAge(27);
        Grace.setMoney(1000.00);

        List<Customers> customerList = new ArrayList<Customers>();
        customerList.add(Grace);
        customerList.add(Helen);

        //Instance of Staff created
        Staff Gideon = new Staff();
        Gideon.setId("Alpha011");
        Gideon.setFirstName("Gideon");
        Gideon.setLastName("Moses");
        Gideon.setAge(30);
        Gideon.setEmail("gideonmoses@gmail.com");
        Gideon.setYearsOfExperience("four");
        Gideon.setQualification("BSC");


        Staff Blessing = new Staff();
        Blessing.setId("Alpha012");
        Blessing.setFirstName("Blessing");
        Blessing.setLastName("Ken");
        Blessing.setAge(26);

        List<Staff> staffList = new ArrayList<Staff>();
        staffList.add(Gideon);
        staffList.add(Blessing);

        //List of products(contained in an Arraylist)
        ArrayList<Products> productList = new ArrayList<Products>();
        productList.add(Bread);
        productList.add(Milk);
        productList.add(Cornflakes);


       //Creating instances of an Applicant
        Applicants Victor = new Applicants();
        Victor.setFirstName("Victor");
        Victor.setYearsOfExperience(4);
        Victor.setQualifications(Qualifications.BSC);
        Victor.setGrades(Grades.SECONDCLASS_LOWER);
        Victor.apply(Victor);
        System.out.println(Victor.apply(Victor));


        //Creating instances of the Manager
        Manager Felix = new Manager();
        Felix.setId("Aplha001");
        Felix.setFirstName("Felix");
        Felix.setLastName("Grace");
        Felix.setAge(35);
        Felix.hire(Victor);

        //System.out.println(Felix.hire(Victor));

        //Method of the Cashier invoked
        //Cashier Instance created
        Cashier cashier = new Cashier();
        cashier.setId("Alpha002");
        cashier.setFirstName("Jacob");
        cashier.setAge(33);


        cashier.dispenseReceipt(Helen, Milk);
        //System.out.println(cashier.dispenseReceipt(Helen, Milk));


       // cashier.sellsProducts(Helen, Bread);
        //System.out.println(cashier.sellsProducts(Helen, Bread));


        Store AlphaStore = new Store();

        //Method of the Customer invoked
        Helen.buyProducts(AlphaStore, Bread, 3);
        System.out.println(Helen.buyProducts(AlphaStore, Bread, 3));


        //Composition Principle
        AlphaStore.setStoreName("AlphaStore");
        AlphaStore.setProducts(productList);
        AlphaStore.setAddress("2, Decagon way");
        AlphaStore.setCustomers(customerList);
        AlphaStore.setStaff(staffList);
      //AlphaStore.setApplicants();

        //System.out.println(AlphaStore);

        String path = "/Users/mac/Documents/TASKS/ConvienienceStore/src/main/resources/productList.csv";
        CSVReader reader = new CSVReader();
        reader.fileReader(AlphaStore, path);
        System.out.println(AlphaStore.getProducts());
    }

}