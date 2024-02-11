package GenericProduct;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.JavaUtility;
import ObjectRepository.HomePage;
import ObjectRepository.Product;
import ObjectRepository.ProductValidation;

public class createProduct extends BaseClass {
	@Test 
public void product() throws Throwable {
	JavaUtility jlib=new JavaUtility();
	String name="iphone14"+jlib.randomNo();
	HomePage home=new HomePage(driver);
	home.Product();
	Product prod=new Product(driver);
	prod.addProduct();
	prod.productName(name);
	prod.saveProduct();
	
	ProductValidation pval=new ProductValidation(driver);
	String actualName = pval.ActualProductName();
	Assert.assertEquals(actualName.contains(name),true);
	System.out.println("verified");
	
	driver.quit();
		
		
	}
	

}
