package com.crm.objectRepsitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignAndProduct {
	
	//initialisation
	public CampaignAndProduct(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	//Declaration
	@FindBy(xpath="//img[@title='Create Product...']")
	private WebElement createProduct;
	
	@FindBy(name="productname")
	private WebElement productName;
	
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement prouctSave;
	
	@FindBy(xpath="//img[@title='Create Campaign...']")
	private WebElement forCampaign ;
	
	
	
	@FindBy(name="campaignname")
	private WebElement campaignName ;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveCampaign;

	public WebElement getCreateProduct() {
		return createProduct;
	}

	public WebElement getProductName() {
		return productName;
	}

	public WebElement getProuctSave() {
		return prouctSave;
	}

	public WebElement getForCampaign() {
		return forCampaign;
	}


	public WebElement getCampaignName() {
		return campaignName;
	}

	public WebElement getSaveCampaign() {
		return saveCampaign;
	}
	
	//Buisness Script
	public void createProductWithCampaign(String name,String prodName,String campName) {
		createProduct.click();
		productName.sendKeys(name);
		prouctSave.click();
		forCampaign.click();
		campaignName.sendKeys(campName);
		saveCampaign.click();	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
