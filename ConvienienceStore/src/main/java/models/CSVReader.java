package models;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    public void fileReader(Store store, String path){
        List<Products> listOfProducts = store.getProducts();
        String Line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((Line = br.readLine()) != null) {
                String[] values = Line.split(",");
                listOfProducts.add(new Products(values[0],Integer.parseInt(values[1]),values[2],Integer.parseInt(values[3])));
            }
            br.close();
            store.setProducts((ArrayList<Products>) listOfProducts);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    }
