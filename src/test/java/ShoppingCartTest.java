import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
  Obtener el valor total del carrito de la compra, donde se pueden ir añadiendo diferentes productos.
  Un producto tendrá un precio y podremos añadir la cantidad que queramos
  Debemos hacer un desarrollo que dando esos datos, nos calcule el valor total del carrito.
 */
public class ShoppingCartTest {

    @Test
    public void getTotalOfEmptyShoppingCart() {
        ShoppingCart shoppingCart = createShoppingCart();
        assertEquals(0.0, shoppingCart.getTotal());
    }

    @Test
    public void getTotalOfSingleProduct() {
        ShoppingCart shoppingCart = createShoppingCart(new Item(100.0, 1));
        assertEquals(100.0, shoppingCart.getTotal());
    }

    @Test
    public void getTotalOfMultipleProducts() {
        ShoppingCart shoppingCart = createShoppingCart(new Item(100.0, 1), new Item(200.0, 1));
        assertEquals(300.0, shoppingCart.getTotal());
    }

    @Test
    public void getTotalOfItemWithQuantityTwo() {
        ShoppingCart shoppingCart = createShoppingCart(new Item(100.0, 2));
        assertEquals(200.0, shoppingCart.getTotal());
    }

    @Test
    public void getTotalOfMultipleItemsAndMultipleQuantities() {
        ShoppingCart shoppingCart = createShoppingCart(new Item(100.0, 3), new Item(50.0, 4), new Item(25.25, 5));
        assertEquals(626.25, shoppingCart.getTotal());
    }
    private static ShoppingCart createShoppingCart(Item... items) {
        return new ShoppingCart(Arrays.asList(items));
    }
}
