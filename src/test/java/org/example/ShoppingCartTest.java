package org.example;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    // Antiguedad cartas
    @Test
    void calculatePrecioAntiguedadForMagicCards_red() {
        // Arrange
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "red", null, "Magic: The Gathering - Lightning Bolt", null);
        // Act
        shoppingCart.addProduct(product);
        // Assert
        assertEquals(shoppingCart.getTotalPrice(), 1.75);

    }

    @Test
    void calculatePrecioAntiguedadForMagicCards_blue() {
        // Arrange
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "red", null, "Magic: The Gathering - Lightning Bolt", null);
        // Act
        shoppingCart.addProduct(product);
        // Assert
        assertEquals(product., 2.50);

    }

    @Test
    void calculateAntiguedadForPets_Spiders() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, false, "", null, "null", null);

        shoppingCart.addProduct(product);

        assertEquals(product.getBasePrice(), 1.2);

    }

    @Test
    void calculateAntiguedadForPets_RedSpiders() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, false, "", null, "null", null);

        shoppingCart.addProduct(product);

        assertEquals(product.getBasePrice(), 11.60);

    }

    @Test
    void calculateAntiguedadForPets_GoldSpiders() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, false, "", null, "null", null);

        shoppingCart.addProduct(product);

        assertEquals(product.getBasePrice(), 12.60);

    }
    @Test
    void calculateAntiguedadForPets_SpidersSttinky() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(8, null, true, "", null, "SpidersSttinky", null);

        shoppingCart.addProduct(product);

        assertEquals(product.getSellPrice(), 9.60);

    }

    @Test
    void calculateAntiguedadForPets_Spiders() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, false, "", null, "null", null);

        shoppingCart.addProduct(product);

        assertEquals(product.getBasePrice(), 1.2);

    }

    @Test
    void calculatePriceForMagicCards_red() {
        // Arrange
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "red", null, "Magic: The Gathering - Lightning Bolt", null);
        // Act
        shoppingCart.addProduct(product);
        // Assert
        assertEquals(shoppingCart.getTotalPrice(), 3.5);

    }

    @Test
    void calculatePriceForMagicCards_blue() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "blue", null, "Magic: The Gathering - Maga Eternal", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 5.0);

    }
    @Test
    void calculatePriceForMagicCards_green() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "green", null, "Magic: The Gathering - Maga Eternal", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 4.40);

    }
    @Test
    void calculatePriceForMagicCards_black() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "black", null, "Magic: The Gathering - Black", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 6.8);

    }
    //TODO verificar esta funcion, ya que el valor 0,10 y no null.
    @Test
    void calculatePriceForPets_blueFish() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "blue", null, null, null);

        shoppingCart.addProduct(product);

        assertEquals(product.getBasePrice(), null);

    }

    //TODO verificar esta funcion ya que el valor es 100 y no null.
    @Test
    void calculatePriceForPets_GoldFish() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "Gold", null, null, null);

        shoppingCart.addProduct(product);

        assertEquals(product.getBasePrice(), null);

    }
    @Test
    void calculatePriceForMagicCards_blackLotus() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "null", null, "Magic: The Gathering - Black Lotus", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 40000.0);

    }
    //TODO colocar el nombre en el default.
    @Test
    void calculatePriceForMagicCards_brown() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "brown", null, "Magic: The Gathering ", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 2.0);

    }


    @Test
    void calculatePriceForMagicCards_green() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "green", null, "Magic: The Gathering - Maga Eternal", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 4.40);

    }

    @Test
    void calculatePriceForMagicCards_black() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "black", null, "Magic: The Gathering - Maga Eternal", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 6.80);

    }

    // TODO cambiar lo default del código del color marron
    @Test
    void calculatePriceForMagicCards_brown() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "brown", null, "Magic: The Gathering - Maga Eternal", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 2.0);

    }

    @Test
    void calculatePriceForMagicCards_blackLotus() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "null", null, "Magic: The Gathering - Black Lotus", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 40000.0);

    }

    @Test
    void calculatePriceForWine() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, false, null, null, "el tio juanillo", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 100.0);

    }

    @Test
    void calculatePriceForCheese() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, true, null, null, "French Camembert", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 50.0);

    }

    @Test
    void calculatePriceForPets_BlueFist() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, false, "blue", null, "null", null);

        shoppingCart.addProduct(product);

        assertEquals(product.getBasePrice(), null);

    }

    @Test
    void calculatePriceForPets_GoldFist() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, false, "gold", null, "null", null);

        shoppingCart.addProduct(product);

        assertEquals(product.getBasePrice(), null);

    }
}

}