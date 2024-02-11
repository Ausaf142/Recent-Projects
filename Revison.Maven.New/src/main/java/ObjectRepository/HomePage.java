package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//Initialisation by creating constructor of class name
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//declaration
	@FindBy(xpath="//a[text()='Organizations']")
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

	//Getters
	public WebElement getOrganisation() {
		return organisation;
	}

	public WebElement getCalender() {
		return calender;
	}

	public WebElement getClickCampaign() {
		return clickCampaign;
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

	public WebElement getMore() {
		return More;
	}

	public WebElement getSignout() {
		return Signout;
	}

	public WebElement getAdministator() {
		return Administator;
	}
	//methods
	public void Organisation() {
		organisation.click();
	}
	public void Calender() {
		calender.click();
	}
	public void Campaign() {
		clickCampaign.click();
	}
	public void Lead() {
		leads.click();
	}
	public void Contacts() {
		Contacts.click();
	}
	public void Opportunity() {
		Opportunities.click();
	}
	public void Product() {
		Products.click();
	}
	public void Document() {
		Documents.click();
	}
	public void Email() {
		Email.click();
	}
	public void TrobuleTicket() {
		TroubleTickets.click();
	}
	public void Dashboard() {
		Dashboard.click();
	}
	public void more() {
		More.click();
	}
	public void SignOut() {
		Administator.click();
		Signout.click();
	}

	
	
}
