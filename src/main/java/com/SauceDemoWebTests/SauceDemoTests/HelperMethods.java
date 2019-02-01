package com.SauceDemoWebTests.SauceDemoTests;
import static org.junit.Assert.assertEquals;


public class HelperMethods {

    public static void checkItemsPresentInCart1 (String itemOnesie) {
        assertEquals("Item onsie not present!", "Sauce Labs Onesie", itemOnesie); //Asserting the name of the first item in the shopping cart
        
    }
    
    public static void checkItemsPresentInCart2 (String itemBikeLight) {
        assertEquals("Item BikeLight not present!", "Sauce Labs Bike Light", itemBikeLight); //Asserting the name of the first item in the shopping cart
        
    }

}
