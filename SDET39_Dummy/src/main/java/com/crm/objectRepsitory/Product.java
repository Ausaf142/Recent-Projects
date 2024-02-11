package com.crm.objectRepsitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product {
	//initialisation
	public Product(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//decalaration
	@FindBy(xpath="//img[@title='Create Product...']")
	private WebElement plusProduct;
	
	@FindBy(name="productname")
	private WebElement productName;
	
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement prouctSave;
	
	

	public WebElement getCreateProduct() {
		return plusProduct;
	}

	public WebElement getProductName() {
		return productName;
	}

	public WebElement getProuctSave() {
		return prouctSave;
	}
	
	

	//Buisness Script
	/**
	 *@used for creating product
	 *@param name 
	 * @author Ausaf
	 */
	public void PlusProduct() {
		plusProduct.click();
	}
		
		public void productName(String name)	{
		productName.sendKeys(name);
		}
		public void saveProduct() {
		prouctSave.click();
	}
	
		
	
	
	
	
	
	
	
	
		}


