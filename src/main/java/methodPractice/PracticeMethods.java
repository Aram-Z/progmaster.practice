package methodPractice;


import java.util.ArrayList;
import java.util.List;

public class PracticeMethods {
    static void main() {


//        int age = 44;
//        double weight = 93.0;
//        String name = "Aram";
//
//        System.out.println("név: " + name + "\n" + "kor: " + age + "\n" + "súly: " + weight);
//
//        int a = 20;
//        int b = 7;
//
//        System.out.println("összeg: " + (a + b));
//        System.out.println("külömbség: " + (a - b));
//        System.out.println("szorzat: " + (a * b));
//        System.out.println("osztás: " + (a / b));
//
//
//        int number = 10;
//
//        number = number + 5;
//        System.out.println(number);
//
//        number = number - 3;
//        System.out.println(number);
//
//        number = number * 2;
//        System.out.println(number);


//        int a = 17;
//        int b = 5;
//        System.out.println(a / b);
//
//        System.out.println(a % b);


//        if ( age >= 18 ){
//            System.out.println("Felnőtt");
//        }else{
//            System.out.println("nem Felnőtt");
//        }
//
//
//        int number = 17;
//
//        if( number % 2 == 0 ){
//            System.out.println("páros");
//        }else{
//            System.out.println("páratlan");
//        }

//        int[] numbers = {10, 20, 30, 40, 50};
//
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//
//        }
//
//        List<String> name = new ArrayList<>();
//        name.add("Aram");
//        name.add("Péter");
//        name.add("János");
//        name.add("Tamás");
//
//        System.out.println(name);
//        System.out.println(name.get(0));
//
//        name.add("Gábor");
//        System.out.println(name);
//
//        for (int i = 0; i < name.size(); i++) {
//            System.out.println(name.get(i));
//
//        }

//        List<String> name = new ArrayList<>();
//
//        name.add("Aram");
//        name.add("Péter");
//        name.add("János");
//        name.add("Tamás");
//        name.add("Gábor");
//
//        name.set(2,"Dávid");
//        name.remove(1);
//
//        for (int i = 0; i < name.size(); i++) {
//            System.out.println(name.get(i));
//
//        }

        Product product = new Product(1, "Laptop", 350000);
        Product product1 = new Product(2, "Telefon", 25000);
        Product product2 = new Product(3, "Egér", 15000);


//        System.out.println(product1.id + " " + product1.name + " " + product1.price);

        List<Product> productList = new ArrayList<>();
        productList.add(product);
        productList.add(product1);
        productList.add(product2);



        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i).id +
                    " " + productList.get(i).name +
                     " " + productList.get(i).price);
            
        }

        for (Product p : productList) {
            System.out.println(p.id + " " + p.name + " " + p.price);
        }
    }

}

