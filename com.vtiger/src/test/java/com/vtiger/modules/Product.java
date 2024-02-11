package com.vtiger.modules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.vtiger.GenericUtility.BaseClass;
import com.vtiger.ObjectUtility.HomePage;
import com.vtiger.ObjectUtility.ProductPage;



public class Product extends BaseClass{
	@Test
	public void createProduct() {
	   HomePage hp=new HomePage(driver);
	   hp.product();
	   ProductPage p=new ProductPage(driver);
	   p.plusproduct();
	   p.ProductName("amarrr");
	   p.saveProduct();
	    


	
}
}