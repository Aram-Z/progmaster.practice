package GemminiPracticeClass;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }


    public double getTotalPrice() {
        double total = 0;
//        for (int i = 0; i < products.size(); i++) {
//           total += products.get(i).getPrice();
//
//        }

        for (Product proPrice : products){
            total += proPrice.getPrice();

        }
        return total;
    }

    public void getProductName(){


        for (int i = 0; i < products.size(); i++) {
            System.out.println((products.get(i).getName()));


        }

    }
}
