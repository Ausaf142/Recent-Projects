package com.crm.objectRepsitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteProduct {
	public DeleteProduct(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//decalaration
		@FindBy(xpath="//input[@name='Delete']")
		private WebElement deleteProduct;

	

		public WebElement getDeleteProduct() {
			return deleteProduct;
		}
		
		//Buisness Script
		/**
		 * @used for create product and then delete that
		 * @param name
		 * @author Ausaf
		 * 
		 */

	
	public void delete() {
		deleteProduct.click();
	}
	
	
	
	
	
	
	
	
	
	
}
