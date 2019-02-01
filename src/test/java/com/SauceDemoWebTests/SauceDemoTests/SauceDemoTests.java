package com.SauceDemoWebTests.SauceDemoTests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) //To ensure the tests are run in ascending order of names
public class SauceDemoTests {

    @BeforeClass
    public static void setupTest (){     
    	UtilMethods.openBrowser(); //setup of driver and browser in UtilMethods.java
    }
 
    //-----------------------------------Tests starting -----------------------------------
    @Test
    public void A01_addToCart () throws InterruptedException {
    	UtilMethods.driver.findElement(By.id("user-name")).sendKeys("standard_user"); //sending user id through the id
    	UtilMethods.driver.findElement(By.id("password")).sendKeys("secret_sauce"); //sending password through the id
    	UtilMethods.driver.findElement(By.className("login-button")).click(); //clicking login with the classname
    	//The below elements need to be added through xpath as there are multiple add to cart buttons
    	UtilMethods.driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[5]/div[3]/button")).click(); //ATC onsie by clicking on the xpath
    	UtilMethods.driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[3]/button")).click(); //ATC bike light by clicking on the xpath
    	UtilMethods.driver.findElement(By.className("shopping_cart_badge")).click(); //Clicking on the mini cart to go to shopping cart
    }
    
    @Test
    public void A02_ItemCheckInCartOnsie () throws InterruptedException {
    	String item1Onesie = UtilMethods.driver.findElement(By.id("item_2_title_link")).getText(); //getting the name of the item onsie
    	System.out.println("Item 1 is : " +item1Onesie);
    	HelperMethods.checkItemsPresentInCart1(item1Onesie);//passing that name to be asserted
    }
    
    @Test
    public void A03_ItemCheckInCartBikeLight () throws InterruptedException {
    	String item2BikeLight = UtilMethods.driver.findElement(By.id("item_0_title_link")).getText(); //getting the bike light name
    	System.out.println("Item 2 is : " +item2BikeLight);
    	HelperMethods.checkItemsPresentInCart2(item2BikeLight);	//passing it to be asserted
    }
 
   //-----------------------------------Test TearDown-----------------------------------
    @AfterClass
    public static void teardownTest () throws InterruptedException{
        //Close browser and end the session
        UtilMethods.driver.quit(); //driver quitting
    }

}
