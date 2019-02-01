package com.SauceDemoWebTests.SauceDemoTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilMethods {
		//Declaring the webdriver
	    public static WebDriver driver;  
	    //Declare the URL variable
	    public static String sauceLabURL = "https://www.saucedemo.com/";
	    //declaring the method for setting the chromedriver property and opening the URL in the browser
	    public static void openBrowser() {
	    	System.setProperty("webdriver.chrome.driver", "/usr/local/chromedriver");
	    	UtilMethods.driver = new ChromeDriver(); 
	    	driver.navigate().to(sauceLabURL); //opening the url in Chrome
	    }
	}

