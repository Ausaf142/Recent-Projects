package com.crm.objectRepsitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddingProductToCampaign {
	public AddingProductToCampaign(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt='Select']")
	private WebElement addPlusProduct;
	
	
	
	@FindBy(name="search_text")
	private WebElement productText;
	
	@FindBy(name="search")
	private WebElement clickSearch ;

	public WebElement getAddProduct() {
		return addPlusProduct;
	}



	public WebElement getSearchProductName() {
		return productText;
	}

	public WebElement getClickSearch() {
		return clickSearch;
	}
	
//business logic
	public void plusProductCampaign() {
		addPlusProduct.click();
	}


	
	public void productName(String name) {
		productText.sendKeys(name);
	}
	
	public void search() {
		clickSearch.click();
	}

	




}

