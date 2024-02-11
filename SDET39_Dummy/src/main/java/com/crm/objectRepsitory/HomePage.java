package com.crm.objectRepsitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//initialisation
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//decalartaion
	@FindBy (xpath="//a[text()='Organizations']")
	private WebElement organisation;
	
	@FindBy (xpath="//a[text()='Calendar']")
	private WebElement calender;
	
	@FindBy(name="Campaigns")
	private WebElement clickCampaign;
	
	@FindBy (xpath="//a[text()='Leads']")
	private WebElement leads;
	
	@FindBy (xpath="//a[text()='Contacts']")
	private WebElement Contacts;
	
	@FindBy (xpath="//a[text()='Opportunities']")
	private WebElement Opportunities;
	
	@FindBy (xpath="//a[text()='Products']")
	private WebElement Products;
	
	@FindBy (xpath="//a[text()='Documents']")
	private WebElement Documents;

	@FindBy (xpath="//a[text()='Email']")
	private WebElement Email;
	
	@FindBy (xpath="//a[text()='Trouble Tickets']")
	private WebElement TroubleTickets;
	
	@FindBy (xpath="//a[text()='Dashboard']")
	private WebElement Dashboard;
	
	@FindBy (xpath="//a[text()='More']")
	private WebElement More;

	@FindBy (xpath="//a[text()='Sign Out']")
	private WebElement Signout;
	
	@FindBy (xpath="//img[@style='padding: 0px;padding-left:5px']")
	private WebElement Administator;

	

	public WebElement getSignout() {
		return Signout;
	}

	public WebElement getMore() {
		return More;
	}

	public WebElement getOrganisation() {
		return organisation;
	}
	public WebElement getClickCampaign() {
		return clickCampaign;
	}

	public WebElement getCalender() {
		return calender;
	}

	public WebElement getLeads() {
		return leads;
	}

	public WebElement getContacts() {
		return Contacts;
	}

	public WebElement getOpportunities() {
		return Opportunities;
	}

	public WebElement getProducts() {
		return Products;
	}

	public WebElement getDocuments() {
		return Documents;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getTroubleTickets() {
		return TroubleTickets;
	}

	public WebElement getDashboard() {
		return Dashboard;
	}
	
	
	public WebElement getAdministator() {
		return Administator;
	}

	//Buisness Script
	public void Organisation() {
		organisation.click();
	}
	public void product() {
		Products.click();
	}
	public void more() {
		More.click();
	}
	
	
	public void signOut() {
		Administator.click();
		Signout.click();
	}
	public void clickCampaign() {
		clickCampaign.click();
	}
	
}
