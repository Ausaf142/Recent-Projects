package com.crm.objectRepsitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organisation {
	//Initialisation
	public Organisation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//decalaration
	
	
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement createOrganisation;
	
	@FindBy(name="accountname")
	private WebElement organisationName;
	
	@FindBy(name="button")
	private WebElement Submit;

	public WebElement getCreateOrganisation() {
		return createOrganisation;
	}

	public WebElement getOrganisationName() {
		return organisationName;
	}

	public WebElement getSubmit() {
		return Submit;
	}
//Buisness Logic
	/**
	 * 
	 * @used for creating oranisation
	 * @param name
	 * @param Oname
	 * @author Ausaf
	 */
	public void plusOraganisation() {
		
		createOrganisation.click();
	}
	public void oraganisationName(String name) {
		organisationName.sendKeys(name);
		Submit.click();
	}
		

	}


















