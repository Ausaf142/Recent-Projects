package com.crm.objectRepsitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductValidation {
	
	 public ProductValidation(WebDriver driver)
	 {
	  PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(css="span.lvtHeaderText")
	 private WebElement actualProductData;

	 public WebElement getActualProductData() {
	  return actualProductData;
	 }

	 public String actualProductName()
	 {
	  return actualProductData.getText();
	 }

}
