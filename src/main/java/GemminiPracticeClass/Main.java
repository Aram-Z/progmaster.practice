package GemminiPracticeClass;

public class Main {
    public static void main(String[] args) {
        // 1. Létrehozzuk a termékeket
        Product milk = new Product("Tej", 450.0);
        Product bread = new Product("Kenyér", 650.0);
        Product cheese = new Product("Sajt", 1200.0);

        // 2. Létrehozzuk a kosarat
        ShoppingCart cart = new ShoppingCart();

        // 3. Beletesszük a termékeket a kosárba
        cart.addProduct(milk);
        cart.addProduct(bread);
        cart.addProduct(cheese);

        System.out.println("A kosárban lévő termékek:");
        cart.getProductName();
        // 4. Kiírjuk a végösszeget
        double total = cart.getTotalPrice();

        System.out.println("A kosár végösszege: " + total + " Ft" );
    }
}