package com.vtiger.ObjectUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

public ProductPage (WebDriver driver) {
	PageFactory.initElements(driver, this);
}
 @FindBy (xpath="//img [@title='Create Product...']")
 public WebElement plusProduct;
 
 @FindBy (name="productname")
 public WebElement ProductName;
 
 @FindBy (name="button")
 public WebElement saveProduct;
 
	private WebElement getplusProduct() {
		return plusProduct;
	}

	public WebElement getProductName() {
		return ProductName;
	}

	public WebElement getSaveProduct() {
		return saveProduct;
	}
	
	//buisness logic
	public void plusproduct() {
		plusProduct.click();
	}
	
	public void ProductName(String name) {
		ProductName.sendKeys(name);
	}
	
	public void saveProduct() {
		saveProduct.click();
	}


}
