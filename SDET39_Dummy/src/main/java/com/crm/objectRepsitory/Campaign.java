package com.crm.objectRepsitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Campaign {
	//initialisation
	public Campaign(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	 //decalaration
	
	@FindBy(xpath="//img[@title='Create Campaign...']")
	private WebElement createCampaign;

	@FindBy(name="campaignname")
	private WebElement nameCampaign;
	
	@FindBy(name="button")
	private WebElement saveCampaign;

	

	public WebElement getCreateCampagn() {
		return createCampaign;
	}

	public WebElement getNameCampaign() {
		return nameCampaign;
	}

	public WebElement getSaveCampaign() {
		return saveCampaign;
	}
	//Buisness script
	/**
	 * @used for creating campaign
	 * @param name
	 * @author Ausaf
	 */

	
	public void plusCampaign() {
		createCampaign.click();
	}
	public void campaignName(String name) {
		nameCampaign.sendKeys(name);
	}
		public void saveCampaign() {
		saveCampaign.click();
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	


