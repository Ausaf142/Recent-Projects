package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organization {
	public Organization(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
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
	
	public void addOrganization() {
		createOrganisation.click();
	}
	public void OrganizationName(String name) {
		organisationName.sendKeys(name);
		
	}
	public void saveOrganisation() {
		Submit.click();
	}
	
}
