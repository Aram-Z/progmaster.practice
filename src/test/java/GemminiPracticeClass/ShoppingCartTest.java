package GemminiPracticeClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {

    private ShoppingCart cart;
    private Product milk;
    private Product bread;

    // Ez a metódus lefut MINDEN egyes teszt előtt, így mindig tiszta kosárral indulunk
    @BeforeEach
    public void setUp() {
        cart = new ShoppingCart();
        milk = new Product("Tej", 500.0);
        bread = new Product("Kenyér", 800.0);
    }

    @Test
    public void testAddProduct() {
        cart.addProduct(milk);

        // Ellenőrizzük, hogy a végösszeg pontosan annyi-e, mint a tej ára
        assertEquals(500.0, cart.getTotalPrice(), 0.001);
    }

    @Test
    public void testGetTotalPriceWithMultipleProducts() {
        cart.addProduct(milk);
        cart.addProduct(bread);

        // 500 + 800 = 1300
        assertEquals(1300.0, cart.getTotalPrice(), 0.001);
    }

    @Test
    public void testEmptyCartPrice() {
        // Egy üres kosár ára 0 kell legyen
        assertEquals(0.0, cart.getTotalPrice(), 0.001);
    }
}